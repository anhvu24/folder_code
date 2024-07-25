package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
	Scanner sc = new Scanner(System.in);
	
	public float chieuCao;
	
	// Constructor
	public HinhTru() {
		ten = "Hinh tru";
	}
	
	public void nhapChieuCao() {
		nhapBanKinh();
		
		System.out.print("Nhap chieu cao: ");
		chieuCao = sc.nextFloat();
	}
	
	public void tinhTheTich() {
		tinhDienTich();
		theTich = dienTich * chieuCao;
	}
	
}
