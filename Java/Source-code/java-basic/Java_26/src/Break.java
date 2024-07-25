import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		int out, in;

		for (out = 0; out <= 5; out++) {
			for (in = 0; in <= 5; in++) {
				System.out.println("in: " + in);
				if (in == 3) {
					break;
				}
			}
			System.out.println("out: " + out);
		}

	}
}
