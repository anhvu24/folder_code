
/* Nhap a va b . Sau do hoan doi vi tri cho nhau*/

#include <stdio.h>

int main()
{
    int a,b,tam;
    printf("Nhap so a:");
    scanf("%d", &a);
    printf("Nhap so b:");
    scanf("%d", &b);
    
    tam=a;
    a=b;
    b=tam;
    printf("Hoan doi thanh %d va %d\n", a,b);
}

