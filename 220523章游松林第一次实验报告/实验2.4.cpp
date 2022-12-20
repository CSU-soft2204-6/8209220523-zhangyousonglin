#include<iostream>
using namespace std;

int main()
{
	cout << "请输入运算符" << endl;
	char a;
	cin >> a;
	cout << "请输入数据" << endl;
	double b, c;
	cin >> b >> c;

	if (a == '+') {
		cout<< b + c;
	}
	else if (a == '-') {
		cout<< b - c;
	}
	else if (a == '*') {
		cout<< b * c;
	}
	else if (a == '/' && c != 0) {
		cout<< b / c;
	}
	else if (a == '%') {
		cout<< (int)b % (int)c;
	}
	else {
		cout << "wrong";
	}

	return 0;
}