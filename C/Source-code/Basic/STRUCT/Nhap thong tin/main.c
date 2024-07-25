//Nhập thông tin nhiêu employee
#include<stdio.h>
#include<string.h>

//Hàm
struct employee
{
    int id;
    char name[50];
    float salary;
};



int main()
{
//Khai bao employee e1, e2
    struct employee e1, e2;

//luu thong tin employee e1
    e1.id = 17;
    strcpy(e1.name, "anh vu");
    e1.salary = 1000;

//luu thong tin employee e1
    e2.id = 19;
    strcpy(e2.name, "em vu ");
    e2.salary = 10050;

//Hien thi employee e1 ra man hinh
    printf("employee 1 id: %d\n", e1.id);
    printf("employee 1 name: %s\n", e1.name);
    printf("employee 1 salary: %f\n\n", e1.salary);

//Hien thi employee e2 ra man hinh
    printf("employee 2 id: %d\n", e2.id);
    printf("employee 2 name: %s\n", e2.name);
    printf("employee 2 salary: %f\n", e2.salary);

    return 0;
}