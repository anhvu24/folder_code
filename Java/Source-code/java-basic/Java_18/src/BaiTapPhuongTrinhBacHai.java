import java.util.Scanner;

public class BaiTapPhuongTrinhBacHai {
	public static void main(String[] args) {

		double x2, a, b, c, delta;
		double x1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap a: ");
		a = sc.nextInt();
		System.out.print("Nhap b: ");
		b = sc.nextInt();
		System.out.print("Nhap c: ");
		c = sc.nextInt();

		delta = b * b - 4 * a * c;

		if (a == 0) {
			System.out.println("a phai lon hon 0");
		} else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep " + "x1 = x2 = " + -b / (2 * a));
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}

	}
	
	
	

}
