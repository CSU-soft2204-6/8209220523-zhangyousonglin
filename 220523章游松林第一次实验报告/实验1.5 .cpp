#include<iostream>
usign namespace std;

int main()
{
	float F, C;
	cout<< "输入你想输入的华氏温度";
	cin >> F;
	C = (F - 32) * 5 / 9.0;
	cout << C;
	return 0;
}