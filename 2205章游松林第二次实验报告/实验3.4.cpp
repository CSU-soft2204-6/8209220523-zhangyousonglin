#include<iostream>
using namespace std;
int f(int n) {
	int i=1,num;
	if (n==1) return 1;
	else { num = (f(n-1) + 1) * 2; }
	return num;
}


int main()
{
	cout << "请输入天数" << endl;
	int day;
	cin >> day;
	cout << "输出最初的数量" << endl;
	cout << f(day);
	return 0;
}