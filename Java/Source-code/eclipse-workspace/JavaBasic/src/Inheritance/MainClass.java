package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		

		Student a = new Student("Anh Vu", 10, 20);
		
		String tenA = a.name;  
		System.out.println(tenA);
		a.hoc();
		
		
		Student2 b = new Student2("Uyen", 20, 10, "dep trai");
		
		String bietDanhB = b.bietDanh;
		System.out.println(bietDanhB);
		b.hoc();
		
		
		
		
		
		
	}

}
