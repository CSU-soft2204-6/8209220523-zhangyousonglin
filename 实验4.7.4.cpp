#include<iostream>
using namespace std;
int* f()
{
	int* list = new int[4];
	int a[] = { 1,2,3,4 };
	for (int i = 0; i < 4; i++) {
		list[i] = a[i];
	}
	return list;
}
void main()
{
	int* p = f();
	cout << p[0] << endl;
	cout << p[1] << endl;
	delete[]p;
}
