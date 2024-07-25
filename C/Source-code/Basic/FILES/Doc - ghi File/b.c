//Đọc các số và dừng khi gặp số 0 
//In ra các số đã đọc

#include<stdio.h>
int main()
{
    FILE *f1;
    float x;

//Ghi
    f1 = fopen("b.txt", "wb");
    do
    {
        printf("Nhap x: ");
        scanf("%f", &x);
        if(x != 0)
        {
            fwrite(&x, sizeof(float), 1, f1);
        }

    } while(x != 0);
    fclose(f1);


//In
    f1 = fopen("b.txt", "rb");
    while(feof(f1) == 0)
    {
        fread(&x, sizeof(float), 1, f1);
        if(feof(f1) == 0)
        {   
            printf("%.1f \n", x);
        }
    }
    fclose(f1);


    return 0;
}