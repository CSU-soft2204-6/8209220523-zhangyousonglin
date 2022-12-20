#include<iostream>
#include<cmath>
using namespace std;
#include"mytriangle.h"

int main()
{
	cout << "请输入三角形三边" << endl;
	double a, b, c;
	cin >> a >> b >> c;
	cout << "输出" << endl;
	cout << _area(a, b, c);
	return 0;
}
