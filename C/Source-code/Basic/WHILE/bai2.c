// Tong cac so le tu 1 den n, n nhap tu phim

#include <stdio.h>

int main()
{
    int i = 1, n, sum = 0;
    printf("Nhap n:");
    scanf("%d", &n);
    while(i <= n)
    {
        if(i%2 != 0)
            sum = sum + i;
            i = i + 1;
    }
    printf("Tong: %d\n", sum);
}
