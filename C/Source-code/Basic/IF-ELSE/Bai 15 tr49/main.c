#include <stdio.h>

int main()
{
    float gio,luong;
    printf("Nhap gio lam:");
    scanf("%f", &gio);
    printf("Nhap Luong:");
    scanf("%f", &luong);
    
    
    if (gio>=0 && gio<=40)
        printf(" Tien nhan: %.2f\n", gio * luong);
    
    else if (gio>=0 && gio > 40)
        printf("Tien nhan: %.2f\n", 40*luong + (gio - 40)*1.5*luong);
    
    else
        printf("ko dc de am");
    
}
