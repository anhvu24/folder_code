// Bai 5

#include <stdio.h>

int main()
{
    float i, n, sum = 0;
    printf("Nhap n:");
    scanf("%f", &n);
    
    for(i = 1; i <= n; i = i + 1)
        sum = sum + 1/i;
    printf("Tong: %f\n", sum);
    
}

