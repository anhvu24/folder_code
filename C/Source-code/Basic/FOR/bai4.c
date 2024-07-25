// Tinh giai thua tu 1 den n
// vd: 3! = 1x2x3

#include <stdio.h>

int main()
{
    int i, n, sum = 1;      //neu ban dau sum = 0 thi 0 x bao nhieu cung = 0
    printf("Nhap n:");
    scanf("%d", &n);
    
    for(i = 1; i <= n; i = i + 1)
        sum = sum*i;
    printf("%d! = %d\n", n, sum);
}
