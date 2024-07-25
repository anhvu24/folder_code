import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);

		System.out.print("Input: ");
		word = sc.nextLine();
		
//		if () {
//			
//		} else {
//
//		}
		

		switch (word.toLowerCase()) {
		case "a": {
			System.out.println(word + " la nguyen am");
			break;
		}
		case "e": {
			System.out.println(word + " la nguyen am");
			break;
		}
		case "i": {
			System.out.println(word + " la nguyen am");
			break;
		}
		case "o": {
			System.out.println(word + " la nguyen am");
			break;
		}
		case "u": {
			System.out.println(word + " la nguyen am");
			break;
		}
		default:
			System.out.println(word + " la phu am");
			break;
		}


	}
}
