package Inheritance;

public class Student2 extends Person {

	String bietDanh;
	
	public Student2(String name, int lop, int tuoi, String bietDanh) {
		super(name, lop, tuoi);				//t.tính kế thừa
		this.bietDanh = bietDanh;			//t.tính thêm vào
	}
		
	
	
	//dùng từ khóa super để bảo trì và nâng cấp code:
	public void hoc() {
		super.hoc();						//p.thức kê thừa
		System.out.println("anh yeu em");   //p.thức thêm vào
	}
	
}





//Student2 là class kế thừa của Person nhưng nâng cấp thêm thuộc tính và phương thức