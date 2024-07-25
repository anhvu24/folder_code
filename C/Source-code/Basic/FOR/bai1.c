// Tinh tong tu 1 den n , n nhap tu ban phim

#include <stdio.h>

int main()
{
    int i, n, sum = 0;
    printf("Nhap n:");
    scanf("%d", &n);
    
    for(i = 1; i <= n; i = i + 1)             // i=i+1 co the viet thanh i++
        sum = sum + i;
    printf("Tong: %d\n", sum);
}
