package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
	Scanner sc = new Scanner(System.in);
	
	public float dai;
	public float rong;
	
	// Constructor
	public HinhChuNhat() {
		ten = "Hinh Chu Nhat";
	}
	
	public void nhapChieuDai() {
		System.out.print("Nhap chieu dai: ");
		dai = sc.nextFloat();
	}
	
	public void nhapChieuRong() {
		System.out.print("Nhap chieu rong: ");
		rong = sc.nextFloat();
	}
	
	public void tinhChuVi() {
		chuVi = 2 * (dai + rong);
	}
	
	public void tinhDienTich() {
		dienTich = dai * rong;
	}
	
	
	
	
	
	
}
