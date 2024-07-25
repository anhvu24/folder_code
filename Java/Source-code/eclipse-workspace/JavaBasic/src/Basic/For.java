package Basic;

public class For {

	public static void main(String[] args) {
		//Tính tổng các số từ 0 đến 5
		int i, sum = 0; 
		int n = 5;
		for (i = 0; i <= n; i++) { 
			sum = sum + i;
		}
		
		System.out.println("Tong: " + sum);
	}

}
