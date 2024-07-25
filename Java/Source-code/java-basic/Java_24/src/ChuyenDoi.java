import java.util.Scanner;

public class ChuyenDoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Nhap vao so nguyen n > 0");
		n = sc.nextInt();
		
		String nhiPhan = "";
		while (n > 0) {
			nhiPhan = n%2 + nhiPhan;
			n = n/2;
		}
		System.out.println(nhiPhan);
		
		
		
		
		
	}
}
