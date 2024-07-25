
/* So sanh 3 so a,b,c */

#include <stdio.h>

int main()
{
    int a,b,c;
    printf("Nhap so a:"); scanf("%d", &a);  
    printf("Nhap so b:"); scanf("%d", &b);
    printf("Nhap so c:"); scanf("%d", &c);
    
    if (a>b)
    {
        if (a>c)
            printf("a Max\n");
        else
            printf("c Max\n");
    }
    else //b>a
    {
        if(b>c)
            printf("b Max\n");
        else
            printf("c Max\n");
    }
    
}
