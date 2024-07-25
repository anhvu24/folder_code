#include <stdio.h>

int main()
{
    float diem;
    printf("Nhap diem:"); scanf("%f", &diem);
    
    if (diem >= 0 && diem <= 10)
    {
        if (diem >= 9)
            printf("Xuat sac\n");
        else if (diem >= 8)
            printf("Gioi\n");
        else if(diem >= 7)
            printf("Kha\n");
        else if(diem >= 6)
            printf("TB Kha\n");
        else if(diem >= 5)
            printf("TB\n");
        else
            printf("Yeu\n");
    }
    else
        printf("Diem ko hop le\n");
}

