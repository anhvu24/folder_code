package shapes;

import java.util.Scanner;

public class HinhTron {
	Scanner sc = new Scanner(System.in);
	
	final float PI = 3.14f;
	
	float r;
	float cv; 
	float dt;

	// Constructor 1, chú ý không có kiểu trả về,
    // và constructor này không có tham số truyền vào
	public HinhTron() {
		nhapBanKinh();
	}
	
	// Constructor 2, cũng không có kiểu trả về,
    // nhưng có một tham số truyền vào
	public HinhTron(float r) {
		this.r = r;
	}
		
	public void nhapBanKinh() {
		System.out.println("Nhap ban kinh: ");
		r = sc.nextFloat();
	}
	
	public void tinhChuVi() {
		cv = 2 * PI * r;
	}
	
	public void tinhDienTich() {
		dt = PI * r * r;
	}
	
	public void inChuVi() {
		System.out.println("chu vi hinh tron: " + cv); 
	}
	
	public void inDienTich() {
		System.out.println("Dien tich hinh tron: " + dt);
	}
		
}
