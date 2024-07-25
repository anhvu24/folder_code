

#include <stdio.h>

int main()
{
    int a;
    printf("Nhap so nam:");
    scanf("%d", &a);
    
    if ((a%4 == 0 && a%100 != 0) || a%400 == 0) 
        printf("%d la nam Nhuan\n",a);
    else 
        printf("Nam %d la nam KO Nhuan\n", a);

}

