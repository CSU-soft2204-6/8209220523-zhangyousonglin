#include<iostream>
using namespace std;
bool a[100] = { false };
void change(int n) {
	if (a[n] == false) a[n] = true;
	else a[n] = false;
}
void f(int n) {
	if (n == 1) fill(a,a+99,true);
	for (size_t i =0; i < 100; i++)
	{
		int k = n + i * (n + 1);
		if (k > 100) break;
		change(k);
	}
}

int main()
{
	for (size_t i = 1; i <= 100; i++)
	{
		f(i);
	}
	for (size_t i = 1; i <=100; i++)
	{
		if (a[i]) cout <<"L" << i << " ";
	}
	return 0;
}