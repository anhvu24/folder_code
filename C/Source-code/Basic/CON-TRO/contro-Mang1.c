// Tinh tong 5 phan tu cua mang su dung con tro

#include<stdio.h>

int main()
{
    int a[5];
    int i, sum = 0;
    int *ptr;

    printf("Nhap 5 phan tu\n");

    for(i = 0; i < 5; i++)
    {
        printf("Nhap a[%d]: ", i);
        scanf("%d", &a[i]);
    }

    ptr = a; // ptr = &a[0];

    for(i = 0; i < 5; i++)
    {
        sum = sum + *ptr;
        ptr = ptr + 1;
    }

    printf("Tong: %d\n", sum);

    return 0;
}   