#include<iostream>
using namespace std;

bool isTriangle(int a, int b, int c) {
	if (a + b < c && a + c < b && b + c < a) {
		return false;
	}
	else {
		return true;
	}
}
void getC(int a, int b, int c) {
	int C=a+b+c;
	if (isTriangle(a,b,c) ){
		cout << C;
	}
	else {
		cout << "error";
	}
}
int main()
{
	int a, b, c;
	cin >> a >> b >> c;
	getC(a, b, c);
	return 0;
}