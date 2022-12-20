#include<iostream>
using namespace std;
int gcd(int a, int b) {
	return b ? gcd(b, a % b) : a;
}

int main() {
	cout << "请输入两个自然数" << endl;
	int a, b;
	cin >> a >> b;
	cout << "输出最大公因数" << endl;
	int c = gcd(a, b);
	cout << c << endl;
	cout << "输出最小公倍数" << endl;
	cout << a / c * b << endl;
	return 0;
}