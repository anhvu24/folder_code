#include<stdio.h>

struct sinhvien
{
    char ten[30];
    char lop[40];
    float diem;

};

int main()
{
    FILE *f1;
    struct sinhvien sv[100];
    int i, n;

    printf("Nhap so luong sinh vien: ");
    scanf("%d", &n);

//nhap ds sv
    f1 = fopen("abc.txt","wb");
    for(i = 1; i <= n; i++)
    {
        fflush(stdin);
        printf("Nhap ten sv thu %d: ", i);
        gets(sv[i].ten);

        printf("Nhap lop sv: ");
        gets(sv[i].lop);

        printf("Nhap diem sv: ");
        scanf("%f", &sv[i].diem);

        fwrite(&sv, sizeof(struct sinhvien), 1, f1);    //Lưu vào file
    }
    fclose(f1);

//xuat ds sv
    f1 = fopen("abc.txt","rb");
    for(i = 1; i <= n; i++)
    {
        fread(&sv, sizeof(struct sinhvien), 1, f1);     //Đọc từ file 
        printf("Ten sv thu %d: %s\n", i, sv[i].ten);
        printf("Lop sv: %s\n", sv[i].lop);
        printf("Diem: %f\n", sv[i].diem);
    }
    fclose(f1);

    return 0;
}