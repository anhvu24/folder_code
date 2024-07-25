//
#include <stdio.h>

int main()
{
    float i = 1, sum = 0, n;
    printf("Nhap n:");
    scanf("%f", &n);
    while(i <= n)
    {
        sum = sum + 1/i;
        i = i + 1;
    }
    printf("Tong: %f", sum);
    
}
