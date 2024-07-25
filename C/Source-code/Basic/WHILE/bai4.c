// Tinh giai thua

#include <stdio.h>

int main()
{
    int i = 1, sum = 1, n;
    printf("Nhap n:");
    scanf("%d", &n);
    while(i <= n)
    {
        sum = sum*i;
        i = i + 1;
    }
    printf("%d! bang: %d\n", n, sum);
}
