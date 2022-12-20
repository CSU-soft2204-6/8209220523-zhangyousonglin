#include<cstdio>

int main()
{
	char a;
	scanf_s("%c",&a);
	if ('a' <= a && a <='z') {
		printf("%c\n", a - 32);
	}
	else {
		printf("%d\n", 'a'+1);
	}
	return 0;
}