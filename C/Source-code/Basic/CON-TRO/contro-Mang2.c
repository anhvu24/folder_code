#include<stdio.h>
// nhap
void nhap(int *a, int n)
{
    int i;
    for(i = 0; i < n; i++)
    {
        printf("Nhap a[%d]: ");
        scanf("%d", a++);
    
    }
}


// xuat
void xuat(int *a, int n)
{
    int i;
    for(i = 0; i < n; i++)
    {
        printf("%d\t", *(a++));
    }
}


// max
int max(int *a, int n)
{
    int i; 
    int max = a[0];
    for(i = 0; i < n; i++)
    {
        if(a[i] > max)
            max = a[i];
    }
    printf("Max: %d\n", max);
    return max;
}

// swap
void swap(int *x, int *y)
{
    int tam;
    tam = *x;
    *x = *y;
    *y = tam;
}


// Sap xep giam
void sxepGiam(int *a, int n)
{
    for(i = 0; i < n - 1; i++)
    {
        for(j = i + 1; j < n; j++)
        {
            if(a[i] > a[j])
                swap(&a[i], &a[j]);
        }
    }
}


//MAIN
int main()
{
    int n, x, y;
    printf("Nhap mang: ");
    scanf("%d", &n);
    int a[n];

    nhap(a, n);

    xuat(a, n);

    max(a, n);

    sxepGiam(a, n);

    printf("Mang da sap xep: \n");
    xuat(a, n);

}