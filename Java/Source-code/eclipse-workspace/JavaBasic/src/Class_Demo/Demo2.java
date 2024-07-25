package Class_Demo;

public class Demo2 {

	public static void main(String[] args) {
		
		Person a = new Person();
		
		//a.thuộc_tính
		a.name = "vu";
		a.tuoi = 12;
		a.cao = 1.65f;

		//a.phương_thức
		a.eat("chicken");
		
		int age = a.soTuoi(); 
		System.out.println(age);
	}

}
