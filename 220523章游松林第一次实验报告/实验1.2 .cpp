#include<iostream>
#include<cmath>
using namespace std;
#define pi acos(-1.0)

int main()
{
	int r, h;
	cin >> r >> h;
	double v = r * r * h * pi * 1 / 3;
	cout << v;
	return 0;
}