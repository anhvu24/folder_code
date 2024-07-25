package NHAP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a {

	
	
	public static int tuoiNhanVien() {
		int tuoi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tuoi nhan vien: ");		
		tuoi = sc.nextInt();	
		if(tuoi < 0) throw new InputMismatchException("Khong dc nhap so am");		
		return tuoi;
	}
	
	
	public static void main(String[] args) {		
		try {
			int tuoiDaNhap = tuoiNhanVien();		
			System.out.println("Tuoi nhan vien la: " + tuoiDaNhap);
		} catch (InputMismatchException e) {
			System.out.println("Tuoi nhap chua hop le " + e.toString());
		}
		
		
		
	}

}
