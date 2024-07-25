#include<stdio.h>

int main()
{
    int a = 10; 
    int b = 20;

    int *contro1, *contro2;
    contro1 = &a;
    contro2 = &b;

    int sum;

    sum = *contro1 + *contro2;
    
    printf("Tong: %d\n", sum); 

    return 0;

}