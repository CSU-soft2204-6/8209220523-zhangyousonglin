#include<iostream>
using namespace std;
const int maxn = 80;
void merge(const int list1[], int size1, const int list2[], int size2, int list[]) {
	int index = 0;
	for (int i = 0, j = 0; i < size1 && j < size2; ) {
		if (list1[i] > list2[j]) {
			list[index++] = list1[i];
			i++;
		}
		else {
			list[i++] = list2[j];
			j++;
		}
		while (i < size1) {
			list[index++] = list1[i++];
		}
		while (j < size2) {
			list[index++] = list2[j++];
		}
	}
}

int main()
{
	int size1,size2,list1[maxn],list2[maxn];
	cout << "°´Ë³ÐòÊäÈësize1£¬list1[maxn],size2,list2[maxn]" << endl;
	cin >> size1;
	for (size_t i = 0; i <size1; i++)
	{
		cin >> list1[i];
	}
	cin >> size2;
	for (size_t i = 0; i < size2; i++)
	{
		cin >> list2[i];
	}
	int list[maxn+maxn];
	 merge(list1,size1,list2,size2, list);
	 cout << "Êä³ö" << endl;
	for (int i = 0; i < size1 + size2; i++) {
		cout << list[i] << " ";
	}
	return 0;
}