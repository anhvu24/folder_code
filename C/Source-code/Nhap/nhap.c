#include<stdio.h>

//ham nhap 
void nhap(int a[], int n)
{
    int i;
    for(i = 0; i < n; i++)
    {
        printf("Nhap so a[%d]: ", i);
        scanf("%d", &a[i]);
    }
}


// ham xuat
void xuat(int a[], int n)
{
    int i;   
    printf("So da nhap: ");
    for(i = 0; i < n; i++)
        printf("%d\t", a[i]);
}

//ham tinh tong 
void sum(int a[], int n)
{
    int i, sum = 0; 
    for(i = 0; i < n; i++)
    {
        sum = sum + a[i];
    }
    printf("\nTong cac gia tri: %d\n", sum);
}

//ham tim kiem vi tri dau tien 
int tim(int a[], int n, int x)
{
    int i; 
    for(i = 0; i< n; i++)
    {
        if(a[i] == x)
            return printf("Vi tri: a[%d]\n", i);
    }
    return printf("KO tim thay\n"); 
}

//ham tim kiem tat ca vi tri 
void timhet(int a[], int n, int x)
{
    int i, dem = 0; 
    for(i = 0; i < n; i++)
    {
        if (a[i] == x)
        {
            printf("vi tri a[%d]\n", i); 
            dem = dem + 1;
        }
    }

    if (dem == 0)
        printf("Ko tim thay\n");
}

//sap xet tu nho den lon 
void sapxep(int a[], int n)
{
    int i, j, tam;  
    for(i = 0; i < n -1; i++)
    {
        for(j = i + 1; j = n; j++)
        {
            if(a[i] > a[j])
            {
                tam = a[i]; 
                a[i] = a[j]; 
                a[j] = tam; 
            }
        }
    }
    printf("sau khi sap xep: ");
    xuat(a, n);
}


//main
int main()
{
    int n; 
    printf("Nhap so luong phan tu: "); 
    scanf("%d", &n);

    int a[n]; 
    nhap(a, n);
    xuat(a, n);
    sum(a, n);

    int x = 7; 
    tim(a, n, x);

    timhet(a, n, x);

    sapxep(a, n);
}