#include<iostream>
#include<cstring>
using namespace std;
const int maxn = 26;
char alphabete[maxn];
int counts[maxn] = { 0 };
void count(const char s[], int counts[]) {
	for (int i = 0; i < strlen(s); i++) {
		if ('a' <= s[i] && s[i] <= 'z') {
			counts[s[i] - 'a']++;
		}
		else counts[s[i] - 'A']++;
	}
}


int main()
{
	char str[100];
	cin.getline(str, 100);
	count(str, counts);
	for (int i = 0; i < 26; i++) {
		if (counts[i] > 0)
			cout << static_cast<char>('a' + i) << ":" << "     " << i << " " << "times" << endl;
	}
	return 0;
}