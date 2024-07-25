import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String ten;
		int tuoi;
		int maSinhVien;

		System.out.print("Nhap ten: ");
		ten = sc.nextLine();

		System.out.print("Nhap tuoi: ");
		tuoi = sc.nextInt();

		System.out.print("Nhap ma sinh vien: ");
		maSinhVien = sc.nextInt();

		System.out.println(ten);
		System.out.println(tuoi);
		System.out.println(maSinhVien);

	}
}
