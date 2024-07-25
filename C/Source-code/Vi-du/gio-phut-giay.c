/* Nhap vao so GIAY. In ra GIO:PHUT:GIAY */

#include <stdio.h>

int main()
{
    int giay;
    printf("Nhap vao so giay:");
    scanf("%d", &giay);
    
    printf("%d bang %02d : %02d : %02d\n",giay, giay/3600, giay%3600/60, giay%3600%60);
    
}
