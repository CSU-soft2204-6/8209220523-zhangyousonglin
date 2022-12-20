#include<cstdio>
#include<cmath>

const double expr = 1e-5;
int main()
{
    double a;
    double x = 1.0, x1=4;
    scanf_s("%lf", &a);
    while (fabs(x - x1) > expr)      
    {
        x1 = x;
        x = (x1 + a / x1) / 2;
    }
    printf("%lf", x);
    return 0;
}