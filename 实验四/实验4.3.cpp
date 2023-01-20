#include<iostream>
using namespace std;

int main()
{
	double a[10];
	for (int i = 0; i < 10; i++) {
		cin >> a[i];
	}
	for (int i = 1; i < 10; i++) {
		for (int k = 0; k < 10-i; k++) {
			if (a[k] > a[k + 1]) {
				swap(a[k], a[k + 1]);
			}
		}
	}
	for (int i = 0; i < 10; i++) {
		cout<<a[i]<<endl;
	}
	return 0;
}
