/* Tra loi cau hoi trac nghiem bang Switch */
// nhap dap an #a,b,c,d => bao loi



#include <stdio.h>

int main()
{
    char e;
    printf("Viet nam co bao nhieu dan toc anh em?\n");
    printf(" a: 52\n b: 53\n c: 54\n d: 55\n");
    printf("Xin moi chon dap an:"); scanf("%s", &e);
    
    switch(e)
    {
        case 'a': printf("Dap an sai\n"); break;
        case 'b': printf("Dap an sai\n"); break;
        case 'c': printf("Dap an dung\n"); break;
        case 'd': printf("Dap an sai\n"); break;
        default: printf("Ban cho khong dung bo ap an (a,b,c,d)\n");
    }
    
}
