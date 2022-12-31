#include<iostream>
#include<cmath>
using namespace std;
int n = 8;
int num = 0;
bool hashtable[100] = { false };
int P[100] = { 0 };
void generateP(int index) {
	if (index == n + 1) {
		num++;
		return;
	}
	for (int x = 1; x <= n; x++) {
		if (hashtable[x] == false) {
			bool flag = true;
			for (int pre = 1; pre < index; pre++) {
				if (abs(index - pre) == abs(x - P[pre])) {
					flag = false;
					break;
				}
			}if (flag) {
				P[index] = x;
				hashtable[x] = true;
				generateP(index + 1);
				hashtable[x] = false;
			}
		}
	}
}
/*	int index = 0;
	bool flag[8] = { false };
	int a[8] = { 0 };
	int x;
	int n = 8;
	int step = 0;
	for (x = 1; x <= 8; x++) {
		for (int i = 0; i < 8; i++) {
			if (index == n + 1) {
				step++;
				break;
			}
			else {
				a[i] = x;
				flag[x] = true;
				for (int j = 1, k = 1; j <= 8, k < index; j++) {
					if (flag[j] == false || (abs(a[i] - a[i + k]) != k) {
						a[i + 1] = j;
						flag[j] = true;
						index++;
					}
				}
			}
		}
*/
int main()
{
	generateP(1);
	cout << num << endl;
	return 0;
}