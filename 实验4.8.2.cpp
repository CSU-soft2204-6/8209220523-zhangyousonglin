#include<iostream>
#include<cstring>
using namespace std;
int parseHex(const char* const hexString) {
	int n = strlen(hexString), temp = 0;
	int b[100];
	for (int i = 0; i < n; i++) {
		if ('0' < hexString[i] && hexString[i] < '9') {
			b[i] = hexString[i] - '0';
		}
		else b[i] = hexString[i] - 'A' + 11;
	}
	for (int i = 0; i < n; i++) {
		if (i == n - 1) {
			temp += b[i];
		}
		else
			temp += b[i] * 16;
	}
	return temp;
}

int main()
{
	char a[] = "A5";
	int n = parseHex(a);
	cout << n;
	return 0;
}