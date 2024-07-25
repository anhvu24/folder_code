package Basic;

public class SwitchCase {

	public static void main(String[] args) {
		
		//Giả sử nhập vào 21
		int tuoi = 21; 
	
		switch(tuoi){
			case 20: System.out.println("20 tuoi"); break;
			case 21: System.out.println("21 tuoi"); 
			
			case 22:
			case 23:
			case 24:
				System.out.println(tuoi + " tuoi"); break;
			default: System.out.println("ko xac dinh");
		}
		 
}

}