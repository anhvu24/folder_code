package Main;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Many_Exception {

	public static void main(String[] args) {
		// Tạo một mảng 10 các số nguyên ngẫu nhiên
		int a[] = new int[10];
		Random rd = new Random();
		
		for(int i = 0; i < 10; i++) {
			a[i] = rd.nextInt(100);			
		}		
		for(int i = 0; i < 10; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
					
		// Cho người dùng nhập một số nguyên và in ra màn hình
		// phần tử mảng tương ứng					
		try {
			int n; 
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao so nguyen bat ki: ");
			n = sc.nextInt();			
			System.out.println(a[n]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Chi duoc nhap tu 0 - 9");
		} catch (NoSuchElementException e) {
			System.out.println("Chi duoc nhap so nguyen");
		}
			
	}

}
