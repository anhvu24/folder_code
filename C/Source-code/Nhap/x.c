#include<stdio.h>

int main()
{
    int n;
    printf("Nhap so luong phan tu: ");
    scanf("%d", &n);


    int a[n]; 

     int i; 
    for( i = 0; i<n; i++)
    {
        printf("Nhap a[%d]: ", i);
        scanf("%d", &a[i]);
    }

    for(i = 0; i<n; i++)
    {
        printf("%d\t", a[i]);

    }


}
