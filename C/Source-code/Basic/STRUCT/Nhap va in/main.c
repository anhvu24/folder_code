#include<stdio.h>

typedef struct SINHVIEN
{
    char ht[25], lop[10];
    float dtb;
} ;


int main()
{
    struct SINHVIEN sv;      // neu trc SINHVIEN mà ko có struct là ko chạy đc, nhưng bên devC vẫn chạy đc
    
    printf("Nhap ho ten sinh vien: \n");
    gets(sv.ht);

    printf("Nhap lop sinh vien: \n");
    gets(sv.lop);

    printf("Nhap diem TB: \n");
    scanf("%f", &sv.dtb);

    printf("Ho ten SV: %s\n", sv.ht);
    printf("Lop SV: %s\n", sv.lop);
    printf("Diem TB: %.2f\n", sv.dtb);
}