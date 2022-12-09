#include<cstdio>
#include<iostream>
using namespace std;
int main() //C 语言程序，要了解
{
	int a[] = { 1,2,3 };
	int* p, i;
	p = a; //将数组 a 首地址送给 p
	for (i = 0; i < 3; i++)
		printf("%d,%d,%d,%d\n", a[i], p[i], *(p + i), *(a + i)); //与 cout 功能差不多
	return 0;
}