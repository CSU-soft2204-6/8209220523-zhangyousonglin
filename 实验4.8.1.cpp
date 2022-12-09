#include<cstdio>
#include<cstring>
const int maxn = 20;

void indexOf(const char s1[], const char s2[]) {
	int len1 = strlen(s1), len2 = strlen(s2);
	for (int i = 0; i < len2; i++) {
		int count = 0, temp = 0;
		for (int j = 0; j < len1;) {
			if (s2[i] == s1[j]) {
				i++;
				j++;
				temp = i - len1;
				count++;
			}
			else break;
		}
		if (count == len1) {
			printf("%d", temp);
			break;
		}
		if (len2 - i <= len1) {
			printf("-1");
			break;
		}
		count = 0;
	}
}

int main()
{
	char s1[maxn], s2[maxn];
	gets_s(s1);
	gets_s(s2);
	indexOf(s1, s2);
	return 0;
}

