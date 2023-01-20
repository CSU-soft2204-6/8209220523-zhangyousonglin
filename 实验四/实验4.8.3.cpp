#include<iostream>
using namespace std;
void sort(int a[], int l1, int r1, int l2, int r2) {
	int i = l1, j = l2;
	int temp[105], index = 0;
	while (i <= r1 && j <= r2) {
		if (a[i] < a[j]) {
			temp[index++] = a[i++];
		}
		else {
			temp[index++] = a[j++];
		}
		while (i <= r1) temp[index++] = a[i++];
		while (j <= r2) temp[index++] = a[j++];
		for (int i = 0; i < index; i++) {
			a[l1 + i] = temp[i];
		}
	}
}
void mergesort(int a[], int l, int r) {
	if (l < r) {
		int mid = l + (r - l) / 2;
		mergesort(a, l, mid);
		mergesort(a, mid+1, r);
		sort(a, l, mid, mid + 1, r);
	}
}


int main()
{
	cout << "input array number" << endl;
	int n;
	cin >> n;
	int* p = new int[n];
	cout << "input elements" << endl;
	for (int i = 0; i < n; i++) {
		cin >> p[i];
	}
	mergesort(p, 0, n - 1);
	int* k = p;
	for (int i = 0; i < n; i++, k++) {
		cout << *k << "  ";
	}
	delete[]p;
	return 0;
}