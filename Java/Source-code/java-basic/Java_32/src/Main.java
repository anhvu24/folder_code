
public class Main {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(23, 11, 2023);
		
		
		System.out.println(date1.getMonth());
		date1.setMonth(13);
		
		System.out.println(date1.getMonth());
		
		
		date1.setMonth(6);
		System.out.println(date1.getMonth());
		
		
		
		
	}
}
