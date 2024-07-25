#include<stdio.h>

// Ham nhap
void nhap(int a[100][100], int n, int m)
{
    int i, j;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < m; j++)
        {
            printf("Nhap a[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }
    }
}

// Ham xuat
void xuat(int a[100][100], int n, int m)
{
    int i, j;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < m; j++)
            printf("%d\t", a[i][j]);
    printf("\n");
    }
    
}

// Ham Tong
int sum(int a[100][100], int n, int m)
{
    int i, j;
    int sum = 0;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < m; j++)
            sum = sum + a[i][j];
    }
    return printf("Tong: %d\n", sum);
     
}

// Ham tim kiem
int find(int a[100][100], int n, int m, int x)
{
    int i, j;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < m; j++)
        {
            if(a[i][j] == x)
                return printf("(find) - vi tri can tim: a[%d][%d]\n", i, j);
        }
    }
    return printf("(find) - Ko tim thay\n");
}

// Ham tim kiem All
int find_All(int a[100][100], int n, int m, int x)
{
    int i, j, dem = 0;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < m; j++)
        {
            if(a[i][j] == x)
            {
                dem = dem + 1;
                printf("(find_All) - Vi tri can tim la a[%d][%d]\n", i, j);
            }
        }
    }
    if(dem == 0)
        printf("(find_All) - Ko tim thay\n");
    
    return 0;
}

// Ham tinh tong tren Hang`
int sum_Hang(int a[100][100], int n, int m, int h)
{
    int j;
    printf("Nhap so hang can tinh tong: "); scanf("%d", &h);
    int tong = 0;
    for(j = 0; j < m; j++)
        tong = tong + a[h][j];
    return printf("Tong hang thu %d = %d\n",h, tong);
}

// Ham tinh tong tren Cot
int sum_Cot(int a[100][100], int n, int m, int c)
{
    int i;
    printf("Nhap so cot can tinh: "); scanf("%d", &c);
    int tong = 0;
    for(i = 0; i < n; i++)
        tong = tong + a[i][c];
    return printf("Tong cot thu %d = %d\n", c, tong);
}

// Ham tim Max
int max(int a[100][100], int n, int m)
{
    int i, j;
    int max = a[0][0];
    for(i = 0; i < n; i++)
        {
            for(j = 0; j < m; j++)
                if(a[i][j] > max)
                    max = a[i][j];
        }
    return printf("Gia tri lon nhat: %d\n", max);
}











//---MAIN
int main()
{
    int n, m;
    printf("Nhap so hang: "); scanf("%d", &n);
    printf("Nhap so cot: "); scanf("%d", &m);
    
    int a[100][100];
    nhap(a, n, m);
    
    xuat(a, n, m);
    
    sum(a, n, m);
    
    int x;
    printf("Nhap so can tim: "); scanf("%d", &x);
    find(a, n, m, x);
    
    find_All(a, n, m, x);
    
    int h;
    sum_Hang(a, n, m, h);
    
    int c;
    sum_Cot(a, n, m, c);
    
    max(a, n, m);
    
    
    
    return 0;
}
