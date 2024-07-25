/* Tim so lon nhat voi lenh IF thieu*/


#include <stdio.h>

int main()
{
    int a, b, max;
    printf("Nhap so a:");
    scanf("%d", &a);
    printf("Nhap so b:");
    scanf("%d", &b);
    
    max=a;
    
    if (b>a)
        max=b;

    printf("So lon nhat la %d\n", max);
    
}
