package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
	Scanner sc = new Scanner(System.in);

	public float banKinh;
	
	// Constructor
	public HinhTron() {
		ten = "Hinh tron";
	}
		
	public void nhapBanKinh() {
		System.out.print("Nhap ban kinh: ");
		banKinh = sc.nextFloat();
	}
	
	public void tinhChuVi() {
		chuVi = 2 * PI * banKinh;
	}
	
	public void tinhDienTich() {
		dienTich = PI * banKinh * banKinh;
	}
	
	
}
