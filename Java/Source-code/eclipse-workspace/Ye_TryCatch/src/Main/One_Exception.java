package Main;

public class One_Exception {

	public static void main(String[] args) {
				
		try {
			int a[] = {1,2,3,4};
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index 5 out of bounds for length 4");
		}
		
		
	}

}
