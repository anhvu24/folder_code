#include<stdio.h>
struct Sinhvien
{
    char ht[25], lop[10];
    float dtb;
};

int main()
{
    struct Sinhvien sv[100], tam;       //biến <tam> cũng phải có kiểu struct
//  struct Sinhvien  tam;              //hoặc có thể viết như thế này
    int i, j, n;

    printf("Nhap so luong sinh vien: "); 
    scanf("%d", &n);

//Nhap
    for(i = 1; i <= n; i++)
    {
        fflush(stdin);
        printf("Nhap ten sinh vien thu %d: ", i);
        gets(sv[i].ht);

        printf("Nhap lop: ");
        gets(sv[i].lop);

        printf("Nhap diem TB: ");
        scanf("%f", &sv[i].dtb);

        printf("\n");
    }

//Sap xep tang dan
    for(i = 1; i <= n - 1; i++)
    {
        for(j = i + 1; j <= n; j++)
        {
            if(sv[i].dtb > sv[j].dtb)
            {
                tam = sv[i];
                sv[i] = sv[j];
                sv[j] = tam;
            }
        }
    }

//Xuat
    for(i = 1; i <= n; i++)
    {
        printf("Ho ten Sv[%d]: %s\n", i, sv[i].ht);
        printf("Lop Sv[%d]: %s\n", i, sv[i].lop);
        printf("Diem TB SV[%d]: %2f\n", i, sv[i].dtb);

        printf("\n");
    }



}