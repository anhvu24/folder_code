//vd3
#include<stdio.h>

enum day{sun, mon = 2, tue, wed = 10, thu = 4, fri, sat};

int main()
{
    printf("%d %d %d %d %d %d %d\n", sun, mon, tue, wed, thu, fri, sat);
    
    return 0;

}