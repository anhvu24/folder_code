
#include <stdio.h>
/*--------------------------------------------------------*/

//1. Ham nhap
void nhap(int a[], int n)
{
    int i;
    for(i = 0; i < n; i = i + 1)
    {
        printf("Nhap a[%d]:", i);
        scanf("%d", &a[i]);
    }
}

/*--------------------------------------------------------*/

//2. Ham xuat
void xuat(int a[], int n)
{
    int i;
    for(i = 0; i < n; i = i + 1)
        printf("%d\t", a[i]);
}

/*--------------------------------------------------------*/

//3. Ham tinh tong
int sum(int a[], int n)
{
    int i, sum = 0;
    for(i = 0; i < n; i = i + 1)
        sum = sum + a[i];
    printf("Tong: %d\n", sum);
    
    return sum;
}

/*--------------------------------------------------------*/

//4. Ham tim kiem vi tri dau tien chua gia tri
int find(int a[], int n, int x)
{
    int i;
    for(i = 0; i < n; i = i + 1)
    {
        if(a[i] == x)
            return printf("Vi tri can tim a[%d]\n", i);
    }
    return printf("Ko tim thay\n");
}

/*--------------------------------------------------------*/

//5. Ham tim kiem All
int find_All(int a[], int n, int x)
{
    int i, dem = 0;
    for(i = 0; i < n; i = i + 1)
    {
        if (a[i] == x)
        {
            dem = dem + 1;
            printf("Vi tri cam tim a[%d]\n", i);
        }
    }
    if(dem == 0)
            printf("Khong tim thay\n");
    
    return 0;
}

/*--------------------------------------------------------*/

//6. Ham tim Max
int tim_Max(int a[], int n) 
{
    int i, max = a[0];
    
    for(i = 0; i < n; i = i + 1)
        if(a[i] > max)
            max = a[i];
    
    return printf("So lon nhat: %d", max);
}

/*--------------------------------------------------------*/

//7. Ham sap xep Tang
void sapxep_tang (int a[], int n)
{
    int i, j, tam;
    for(i = 0; i < n - 1 ; i = i + 1)
    {
        for(j = i + 1; j < n; j = j + 1)
        {
            if(a[i] > a[j])
            {
                tam = a[i];
                a[i] = a[j];
                a[j] = tam;
            }
        }
    }
    printf("Mang sau khi sap xep Tang: ");
    xuat(a, n);
}

/*--------------------------------------------------------*/

//8. Ham sap xep Giam
void sapxep_giam (int a[], int n)
{
    int i, j, tam;
    for(i = 0; i < n - 1; i = i + 1)
    {
        for(j = i + 1; j < n; j = j + 1)
        {
            if(a[i] < a[j])
            {
                tam = a[i];
                a[i] = a[j];
                a[j] = tam;
            }
        }
    }
    printf("Mang sau khi sap xep Giam: ");
    xuat(a, n);
}

/*--------------------------------------------------------*/

//9. Ham trung binh cong cac gia tri trong mang
float sum_TB(float a[], float n)
{
    return printf("Trung binh: %.2f", sum(a, n)/n);
}

/*--------------------------------------------------------*/

// MAIN>>>>>>>>>>
int main()
{
    int n;
    printf("Nhap n:"); scanf("%d", &n);
    
    int a[n];
    printf("ham 1:\n");
        nhap(a, n); printf("\n\n");
    
    printf("ham 2:\n");
        xuat(a, n); printf("\n\n");
    
    printf("ham 3:\n");
        sum(a, n); printf("\n\n");
    
    int x;
    printf("ham 4:\n");
    printf("Nhap so can tim:"); scanf("%d", &x);
        find(a, n, x); printf("\n\n");
    
    printf("ham 5:\n");
        find_All(a, n, x); printf("\n\n");
    
    printf("ham 6:\n");
        tim_Max(a, n); printf("\n\n");
    
    printf("ham 7:\n");
        sapxep_tang(a, n); printf("\n\n");
    
    printf("ham 8:\n");
        sapxep_giam(a, n); printf("\n\n");
    
    printf("ham 9:\n");
        sum_TB(a, n); printf("\n\n");
    
    
    return 0;

}
