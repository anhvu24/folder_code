//vd2
#include<stdio.h>

enum day{sun, mon, tue, wed, thu, fri, sat};
//       (0)  (1)  (2)  ...            (6)


int main()
{
    enum day d1 = sun;
    enum day d2 = sat;
    printf("So ngay duoc luu tru trong bien d1: %d\n", d1);
    printf("So ngay duoc luu tru trong bien d2: %d\n", d2);
        
    return 0;

}