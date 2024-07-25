package shapes;

import java.util.Scanner;

public class HinhChuNhat {
	Scanner sc = new Scanner(System.in);
	
	float dai; 
	float rong; 
	float cv;
	float dt;
	
	public void nhapChieuDai() {
		System.out.println("Nhap chieu dai: ");
		dai = sc.nextFloat();
	}
	
	public void nhapChieuRong() {
		System.out.println("Nhap chieu rong: ");
		rong = sc.nextFloat();
	}
	
	public void tinhChuVi() {
		cv = 2 * (dai + rong);
	}
	
	public void tinhDienTich() {
		dt = dai * rong;
	}
	
	public void inChuVi() {
		System.out.println("Chu vi HCN: " + cv);
	}
	
	public void inDienTich() {
		System.out.println("Dien tich HCN: " + dt);
	}
	
}
