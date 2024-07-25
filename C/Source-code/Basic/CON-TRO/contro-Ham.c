// Bài này mục đích là chuyển Phút >> Giờ
#include<stdio.h>

//Ham 
void chuyendoi(int *p_gio, int *p_phut)
{
    while(*p_phut >= 60)                                                                            
    {
        *p_phut = *p_phut - 60;
        *p_gio = *p_gio + 1;
    }
}

int main()
{
    int gio = 0, phut = 90;

    chuyendoi(&gio, &phut);
    printf("Sau chuyen doi: %d gio %d phut\n", gio, phut);

    return 0;


}