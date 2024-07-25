#include <stdio.h>

int main()
{
    float x, y;
    char pheptoan;
    
    printf("Nhap x:");
    scanf("%f", &x);
    printf("Nhap y:");
    scanf("%f", &y);
    printf("Nhap phep toan:");
    scanf("%s", &pheptoan);
    
    switch (pheptoan) 
    {
        case '+': printf("x + y = %f\n", x+y);break;
        case '-': printf("x -y = %f\n", x-y); break;
        case '*': printf("x*y = %f\n", x*y);break;
        case '/':
        { 
            if (y==0)
                printf("Khong thuc hien duoc phep toan");
             else 
                printf("x/y = %f\n", x/y);break;
            
        default: printf("Khong duoc de dau =\n");
        }
    }
    return 0;
}
