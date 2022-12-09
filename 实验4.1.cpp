#include<iostream>
using namespace std;

int main()
{
	int a[10],b[10]={0};
	for (int i = 0; i < 10; i++) {
		cin >> a[i];
		b[a[i]]++;
	}
	for (int k = 0; k < 10; k++) {
		if (b[a[k]] == 1) {
			cout << a[k] << " ";
		}
	}
	
	return 0;
}