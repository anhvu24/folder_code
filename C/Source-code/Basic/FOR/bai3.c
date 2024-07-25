// Tong binh phuong cac so chan tu 1 den n

#include <stdio.h>

int main()
{
    int i, n, sum = 0;
    printf("Nhap n:"); scanf("%d", &n);
    
    for(i = 1; i <= n; i++)       // i++ => i = i + 1 
    {
        if(i%2 == 0)
            sum = sum + i*i;
    }
   printf("Tong binh phuong cac so chan tu 1 den %d la: %d\n", n, sum);
}
