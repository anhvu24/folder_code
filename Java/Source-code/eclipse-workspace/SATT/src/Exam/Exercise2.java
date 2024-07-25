package Exam;

import java.util.Scanner;

public class Exercise2 {

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

		//tim max 
		int max1 = a[0];
		int max2 = a[1]; 
		
	    if (a[0] > a[1]){
	        max1 = a[0];
	        max2 = a[1];
	    }
	    else{
	        max1 = a[1];
	        max2 = a[0];
	    }
	    
	    for(i = 2; i < n; i++){
	        if(a[i] >= max1){
	            max2 = max1;
	            max1 = a[i];
	        }
	        else if (a[i] > max2){
	            max2 = a[i];
	        }
	    }
	    System.out.println("So lon thu 2: " + max2);
		
	}

}
