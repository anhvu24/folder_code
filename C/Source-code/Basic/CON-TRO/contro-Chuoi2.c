#include<stdio.h>

const int KichCo = 4;

int main()
{
    char *hotensv[] = {
                        "Sv 1",
                        "Sv 2",
                        "Sv 3",
                        "Sv 4",
                    };

    int i = 0;
    for(i = 0; i < KichCo; i++)
    {
        printf("Gia tri cua hotenSv[%d]: %s\n", i, hotensv[i]);
    }
    return 0;
}