//SỬ DỤNG HÀM 
#include<stdio.h>

//Ham struct
struct sinhvien
{
    char ten[30], lop[20];
    float diem;
};

//Ham nhap
void nhap(struct sinhvien sv[], int n)
{
    int i;
    for(i = 1; i <= n; i++)
    {
        fflush(stdin);

        printf("Nhap ten sv[%d]: ", i);
        gets(sv[i].ten);

        printf("Nhap lop sv: ");
        gets(sv[i].lop);

        printf("Nhap diem sv: ");
        scanf("%f", &sv[i].diem);
    }
}

//Ham xuat
void xuat(struct sinhvien sv[], int n)
{
    int i;
    for(i = 1; i <= n; i++)
    {
        printf("Ten sv[%d]: %s\n", i, sv[i].ten);
        printf("Lop sv: %s\n", sv[i].lop);
        printf("Diem sv: %.2f\n", sv[i].diem);
        printf("\n");
    }
}

//Ham sap xep
void sapxep(struct sinhvien sv[], int n)
{
    int i, j;
    struct sinhvien tam;

    for(i = 1; i <= n -1; i++)
    {
        for(j = i +1; j <= n; j++)
        {
            if(sv[i].diem > sv[j].diem)
            {
                tam = sv[i];
                sv[i] =  sv[j];
                sv[j] = tam;
            }
        }
    }
    printf("Sau khi sap xep: \n");
    xuat(sv, n);
}


//MAIN
int main()
{
    struct sinhvien ds[100];
    int n;

    printf("Nhap so luong sinh vien: "); scanf("%d", &n);

    nhap(ds, n);

    xuat(ds, n);
    
    sapxep(ds, n);

    return 0;
}