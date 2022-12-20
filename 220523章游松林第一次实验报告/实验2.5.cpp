#include<cstdio>
#include<cstring>
const int maxn = 100;
int main()
{
	int a[4] = { 0 };
	char str[maxn];
		gets_s(str);
		for (int i = 0;i<strlen(str) ;i++)
		{
			if (str[i] == '\n') {
				break;
			}
			else if ('A' <= str[i] &&str[i] <= 'Z' || 'a' <= str[i] && str[i] <= 'z') {
				a[0]++;
			}
			else if (str[i] == ' ') {
				a[1]++;
			}
			else if (str[i] >= '0') {
				a[2]++;
			}
			else {
				a[3]++;
			}
		};
	printf("%d %d %d %d", a[0], a[1], a[2], a[3]);
	return 0;	
}