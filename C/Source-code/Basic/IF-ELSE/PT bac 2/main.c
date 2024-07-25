/* Giat pt bac 2*/

#include <stdio.h>
#include <math.h>

int main()
{
    float a,b,c,denta;
    printf("Nhap a:");
    scanf("%f", &a);
    printf("Nhap b:");
    scanf("%f", &b);
    printf("Nhap c:");
    scanf("%f", &c);
    
    if (a==0)
    {
        if (b==0)
        {
            if (c==0)
                printf("Pt vo so nghiem");
            else
                printf("Pt vo nghiem");
        }
        else
            printf("Pt co nghiem: %f", -c/b);
    }
    else
    {
        denta=b*b-4*a*c;
        if (denta>0)
            printf("Pt co nghiem x1 = %f, x2 = %f", (-b+sqrt(denta))/2*a, (-b-sqrt(denta))/2*a);
        else if (denta==0)
            printf("Pt co nghiem x1 = x2 = %f", -b/2*a);
        else
            printf("Pt vo nghiem");
    }

}
