package Main;

public class TryCatch_with_Finally {

	public static void main(String[] args) {
		try {
		    System.out.println("Bài toán thực hiện phép chia:");
		    int ketQua = 10 / 0;
		    System.out.println("10 chia 0 bằng: " + ketQua);
		} catch (ArithmeticException e) {
		    System.out.println("Phép chia không thực hiện được");
		} finally {
		    System.out.println("Kết thúc chương trình");
		}

	}

}
