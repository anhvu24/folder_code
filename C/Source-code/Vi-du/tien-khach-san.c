/* bai nay tinh tien o khach san*/

/*   ngay den: a
     ngay di: b     */

#include<stdio.h>

int main()
{
    int a, b;
    printf("Nhap so ngay den:");
    scanf("%d", &a);
    printf("Nhap so ngay di:");
    scanf("%d", &b);
    
    printf("So ngay o la: %d\n", b-a);
    
    printf("Khach da o: %d tuan va %d ngay\n", (b-a)/7, (b-a)%7);
    
    printf("Tong tien bang: %d\n", (b-a)/7*650 + (b-a)%7*100);
}

