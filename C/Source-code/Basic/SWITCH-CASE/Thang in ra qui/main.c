#include <stdio.h>

int main()
{
    int a;
    printf("Nhap vao thang:");
    scanf("%d", &a);
    switch (a){
        case 1: printf("Qui 1\n"); break;
        case 2: printf("Qui 1\n"); break;
        case 3: printf("Qui 1\n"); break;
        
        case 4: printf("Qui 2\n"); break;
        case 5: printf("Qui 2\n"); break;
        case 6: printf("Qui 2\n"); break;
            
            case 7: printf("Qui 3\n"); break;
            case 8: printf("Qui 3\n"); break;
            case 9: printf("Qui 3\n"); break;
            
            case 10: printf("Qui 4\n"); break;
            case 11:printf("Qui 4\n"); break;
            case 12: printf("Qui 4\n"); break;
            
        default: printf("Ban phai nhap tu 1 den 12/n");
    }
}
