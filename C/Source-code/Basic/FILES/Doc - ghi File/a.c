//Lưu trữ thông tin nhân viên

#include<stdio.h>
int main()
{
    FILE *nhanvien;
    int id;
    char name[30];
    int salary;

    nhanvien = fopen("a.txt", "w+");   //mở File

    if(nhanvien == NULL)
    {
        printf("File ko ton tai\n");
    }

  
    printf("Nhap ID: ");                //nhập
    scanf("%d", &id);                   //quét vào
    fprintf(nhanvien,"ID: %d\n", id);   //in ra 

    printf("Nhap ten: ");
    scanf("%s", &name);
    fprintf(nhanvien, "Ten nv: %s\n", name);

    printf("Nhap luong: ");
    scanf("%d", &salary);
    fprintf(nhanvien, "Luong: %d\n", salary);

    fclose(nhanvien);   //đóng File
}