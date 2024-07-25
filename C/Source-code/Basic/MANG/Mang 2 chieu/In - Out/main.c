#include <stdio.h>

int main()
{
    int n, m, i, j;
    printf("Nhap n: "); scanf("%d", &n);
    printf("Nhap m: "); scanf("%d", &m);
    
    int a[n][m];


//Nhap
for(i = 0; i < n; i++)
{
    for(j = 0; j < m; j++)
    {
        printf("Nhap phan tu a[%d][%d]: ", i, j);
        scanf("%d", &a[i][j]);
    }
}


//Xuat
for(i = 0; i < n; i++)
{
    for(j = 0; j < m; j++)
    {
        printf("%d\t", a[i][j]);
    }

    printf("\n");
}

}
