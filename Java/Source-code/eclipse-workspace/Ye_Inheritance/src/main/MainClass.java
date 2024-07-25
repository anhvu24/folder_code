package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class MainClass {

	public static void main(String[] args) {
		
		HinhTron hinhTronA = new HinhTron();
		HinhTru hinhTruA = new HinhTru();
		HinhChuNhat hinhChuNhatA = new HinhChuNhat();
		HinhVuong hinhVuongA = new HinhVuong();
				
		//hinhTronA
		hinhTronA.xuatTen();
		hinhTronA.nhapBanKinh();
		hinhTronA.tinhChuVi();
		hinhTronA.tinhDienTich();
		hinhTronA.inChuVi();
		hinhTronA.inDienTich();
		System.out.println();
		
		//hinhTruA
		hinhTruA.xuatTen();
		hinhTruA.nhapChieuCao();
		hinhTruA.tinhTheTich();
		hinhTruA.inTheTich();
		System.out.println();
		
		//hinhChuNhatA
		hinhChuNhatA.xuatTen();
		hinhChuNhatA.nhapChieuDai();
		hinhChuNhatA.nhapChieuRong();
		hinhChuNhatA.tinhChuVi();
		hinhChuNhatA.tinhDienTich();
		hinhChuNhatA.inChuVi();
		hinhChuNhatA.inDienTich();
		System.out.println();
		
		//hinhVuongA
		hinhVuongA.xuatTen();
		hinhVuongA.nhapCanh();
		hinhVuongA.tinhChuVi();
		hinhVuongA.tinhDienTich();
		hinhVuongA.inChuVi();
		hinhVuongA.inDienTich();
	

		
	}

}
