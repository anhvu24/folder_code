import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int n; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		
		if (n%2 == 0) {
			System.out.println("n chan");
		} else {
			System.out.println("n le");
		}
		
	}
}
