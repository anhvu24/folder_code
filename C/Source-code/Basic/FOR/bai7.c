
// Bai 7

#include <stdio.h>

int main()
{
    float i, n, sum = 1;
    printf("Nhap n:");
    scanf("%f", &n);
    
    for(i = 1; i <= n; i = i + 1)
        sum = sum + 1/(2*i + 1);
    printf("Tong: %f\n", sum);
    
    
}

