#include<stdio.h>

int main()
{
    //Khai báo biến x và 2 biến con trỏ
    int x;              //biến x
    int *px, *qx;       //biến con trỏ

    px = &x;            //lưu đ.chỉ của biến trong con trỏ

    printf("Nhap gia tri cho vung nho px tro den: ");
    scanf("%d", px);    //px là con trỏ nên KO viết scanf("%d", &px);

    qx = px;            //gán giá trị của px cho qx, qx cùng trỏ đến x

    printf("Vi tri cua bien x la: %p\n", &x);
    printf("Vi tri cua bien x la: %p\n", px);
    printf("Vi tri cua bien x la: %p\n", qx);

    printf("Noi dung cua bien x la: %d\n", x);
    printf("Noi dung cua bien x la: %d\n", *px);
    printf("Noi dung cua bien x la: %d\n", *qx);

    //Tăng giá trị của ô nhớ (x = x + 1000)
    *px += 1000;
    printf("Sau khi tang: %d\n", x);    //có thể thay x thành *px hoặc *qx

    //Cộng thêm 1 đơn vị cho px (px = px + 1) =>> px trỏ đến vùng nhớ tiếp theo 
    px++;
    printf("Vi tri px tro den: %p\n", px);

    return 0;


}