#include<stdio.h>
#include<string.h>

struct Employee
{
    int id;
    char name[20];

    struct Date
    {
        int day;
        int month;
        int year;
    }birthday;

}e1;


int main()
{

//Luu thong tin Employee e1
    e1.id = 12;
    strcpy(e1.name, "em vu");
    e1.birthday.day = 11;
    e1.birthday.month = 2;
    e1.birthday.year = 2000;

    printf("Employee id: %d\n", e1.id);
    printf("Emplyee name: %s\n", e1.name);
    printf("Employee Birthday: %d/%d/%d\n", e1.birthday.day, e1.birthday.month, e1.birthday.year);

    return 0;
}