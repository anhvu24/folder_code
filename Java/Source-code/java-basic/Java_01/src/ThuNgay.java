
public class ThuNgay {

	public static void main(String[] args) {
		int max = 5;

		loop: for (int a = 0; a <= 10; a++) {
			for (int i = 0; i <= max; i++) {
				if (a == 3) {
					continue loop;
				}
				System.out.println("   i = " + i);
			}
			System.out.println("a = " + a);
		}
		System.out.println("ket thuc");

	}
}
