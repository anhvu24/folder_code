//
//  main.c
//  vd4
//
//  Created by DOAN ANH VU on 4/11/21.
//  Copyright © 2021 DOAN ANH VU. All rights reserved.
//

/* Chuong trinh nay in vao ban kinh hinh tron, Tinh ra chu vi*/
#include <stdio.h>
#define PI 3.14

int main()
{
    float R;
    printf("Nhap ban kinh hinh tron:");
    scanf("%f", &R);
    printf("Hinh tron co chu vi bang %.2f.\n", 2*PI*R);

}

