// Tong tu 1 den n, n nhap tu ban phim

#include <stdio.h>

int main()
{
    int n, sum = 0;
    printf("Nhap n:");
    scanf("%d", &n);

    int i = 1;
    while(i <= n)
    {
        sum = sum + i;
        i = i + 1;
    }
    printf("Tong: %d\n", sum);
}
