package Exam;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n; 
		System.out.print("Nhap so luong phan tu cua mang: ");
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		//nhap gia tri vao mang
		int i; 
		for(i = 0; i < n; i++) {
			System.out.print("nhap a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		
		//xuat mang
		System.out.print("mang da nhap: ");
		for(i = 0; i < n; i++) {
			System.out.print(a[i]);
		}
				
		//dao nguoc mang 
		System.out.print("mang sau khi dao: ");
		for(i = n; i > 0; i--) {
			System.out.print(a[i-1]);
		}
		
	}

}
