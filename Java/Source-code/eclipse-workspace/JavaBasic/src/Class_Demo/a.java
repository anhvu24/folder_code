package Class_Demo;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Person[] a = new Person[3];
		
		int i;
		//nhap
		for(i = 0; i < 3; i++) {
			a[i] = new Person();
			
			System.out.print("nhap ten: ");
			a[i].name = sc.next();
			
			System.out.print("nhap tuoi: ");
			a[i].tuoi = sc.nextInt();
			
			System.out.print("nhap cao: ");
			a[i].cao = sc.nextFloat();
			
		}
		
		//xuat
		for(i = 0; i < 3; i++) {
			System.out.println(a[i].name);
			System.out.println(a[i].tuoi);
			System.out.println(a[i].cao);
		}

	}

}
