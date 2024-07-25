#include <stdio.h>
#include<string.h>

int main()
{
    char a[50];
    printf("Nhap ten: ");
    gets(a);
    
    int i, count = 0;
    for(i = 0; i < strlen(a); i++)
    {
        if(a[i] == 'a')
            count = count + 1;
    }
    printf("%d\n", count);
    
    return 0;
}
