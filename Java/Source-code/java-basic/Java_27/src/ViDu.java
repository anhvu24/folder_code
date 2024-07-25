import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap a la so nguyen: ");
		try {
			a = sc.nextInt();
		} catch (Exception e) {
			System.out.println("a ko phai la so nguyen roi");
		}finally {
			System.out.println("hello");
		}

		System.out.println("so da nhap: " + a);
		System.out.println("Ket thuc");

	}
}
