import java.util.Scanner;

public class KiemTraThuNgay {
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap ngay muon in: ");
		n = sc.nextInt();

		switch (n) {
		case 2: {
			System.out.println("Thu 2");
			break;
		}
		case 3: {
			System.out.println("Thu 3");
			break;
		}
		case 4: {
			System.out.println("Thu 4");
			break;
		}
		case 5: {
			System.out.println("Thu 5");
			break;
		}
		case 6: {
			System.out.println("Thu 6");
			break;
		}
		case 7: {
			System.out.println("Thu 7");
			break;
		}
		case 8: {
			System.out.println("CN");
			break;
		}
		default:
			System.out.println("Nhap tu 2 den 8");
		}

	}
}
