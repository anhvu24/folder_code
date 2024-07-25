package Inheritance;

public class Student extends Person {

	public Student(String name, int lop, int tuoi) {
		super(name, lop, tuoi);			//thuộc tính kế thừa
	}
	
	public void hoc() {
		super.hoc();					//p.thức kế thừa		
	}

}
