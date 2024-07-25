package main;

import shapes.HinhTron;

public class MainClass {

	public static void main(String[] args) {
		
		// Cách khai báo HinhTron dựa vào constructor thứ nhất
		HinhTron hinhTron1 = new HinhTron();
		
		// Cách khai báo HinhTron dựa vào constructor thứ hai
		HinhTron hinhTron2 = new HinhTron(10);
		
		// Tính toán và in ra kết quả cho hinhTron1
		System.out.println("Ket qa cho hinhTron1: ");
		hinhTron1.tinhChuVi();
		hinhTron1.tinhDienTich();
		hinhTron1.inChuVi();
		hinhTron1.inDienTich();
		
		// Tính toán và in ra kết quả cho hinhTron2
		System.out.println("Ket qa cho hinhTron2: ");
		hinhTron2.tinhChuVi();
		hinhTron2.tinhDienTich();
		hinhTron2.inChuVi();
		hinhTron2.inDienTich();
	
	}

}
