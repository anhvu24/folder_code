#include <stdio.h>

int main()
{
    float i,n,s=0;
    printf("Nhap so n:"); scanf("%f", &n);
    for (i=1; i<=n; i=i+1)
        s = s + 1/(2*i);
    printf("Tong bang: %f\n",s);
}
