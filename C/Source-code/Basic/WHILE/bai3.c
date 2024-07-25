// Tong binh cac so chan tu 1 den n

#include <stdio.h>

int main()
{
    int i = 1, sum = 0, n;
    printf("Nhap n:");
    scanf("%d", &n);
    while(i <= n)
    {
        if(i%2 == 0)
            sum = sum + i*i;
            i = i + 1;
    }
    printf("Tong: %d\n", sum);
}
