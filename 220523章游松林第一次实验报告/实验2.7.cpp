#include<iostream>
using namespace std;

int main()
{
	for (int i=0;i<5;i++)
	{
		for (int j = 0; j < 6; j++) {
			if (j >=5-i) {
				cout <<'*';
			}
			else {
				cout << " ";
			}
		}cout << endl;
	}
	return 0;
}