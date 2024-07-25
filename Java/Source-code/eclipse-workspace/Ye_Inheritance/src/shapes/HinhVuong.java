package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
	Scanner sc = new Scanner(System.in);
	
	//constructor
	public HinhVuong() {
		ten = "Hinh Vuong";
	}
	
	public void nhapCanh() {
		System.out.print("Nhap canh: ");
		dai = rong = sc.nextFloat();
	}
	
	
}
