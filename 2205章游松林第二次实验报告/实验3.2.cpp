#include<iostream>
#include<cmath>
using namespace std;
bool is_prime(int num) {
	double n = sqrt(num * 1.0);
	for (int i = 2; i <= n; i++) {
		if (num % i == 0) return false;
	}return true;
}
int main() {
	int count = 0;
	for (int i = 2; i <= 200; i++) {
		if (is_prime(i)) {
			cout << i<<" ";
			count++;
			if (count % 10 == 0) {
				cout << endl;
			}
		}
	}
	return 0;
}