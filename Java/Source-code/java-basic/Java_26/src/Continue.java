import java.util.Iterator;

public class Continue {
	public static void main(String[] args) {
		int out, in;

		for (out = 0; out <= 5; out++) {
			for (in = 0; in <= 5; in++) {
				if (in == 3) {
					continue;
				}
				System.out.println("in: " + in);
			}
			System.out.println("out: " + out);
		}

	}
}
