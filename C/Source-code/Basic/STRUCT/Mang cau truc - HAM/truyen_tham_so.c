//Truyền tham số kiểu Cấu trúc
#include<stdio.h>
#include<string.h>

struct book
{
    char tieude[50];
    char tacgia[50];
    char chude[50];
    int id;

};


//Ham xuat
void inthongtin(struct book no)
{
    printf("Tieu de sach: %s\n", no.tieude);
    printf("tac gia sach: %s\n", no.tacgia);
    printf("Chu de sach: %s\n", no.chude);
    printf("Book ID: %d\n", no.id);
}

int main()
{
    struct book no1;
    struct book no2;

    //nhap thong tin sach 1
    strcpy(no1.tieude, "Lap trinh");
    strcpy(no1.tacgia, "anh vu");
    strcpy(no1.chude, "Tin");
    no1.id = 1234;

    //nhap thong tin sach 2
    strcpy(no2.tieude, "Anh van");
    strcpy(no2.tacgia, "Em vu");
    strcpy(no2.chude, "ngoai ngu");
    no2.id = 2323;


    inthongtin(no1);

    inthongtin(no2);
}
