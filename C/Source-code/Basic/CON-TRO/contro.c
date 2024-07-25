#include<stdio.h>

int main()
{
    int tuoi = 15;
    int *ptuoi = NULL;          // con tro
    ptuoi = &tuoi;
    printf("Gtri cua bien tuoi: %d", *ptuoi);
    printf("Dia chi cua bien tuoi: %d\n", &tuoi);
    printf("Dia chi cua con tro chi den: %d\n", ptuoi);

    return 0;
}