package Class_Demo;

public class Person {
	//thuộc tính
	String name;
	int tuoi;
	float cao;
	
	
	//Đây là 1 constructor(hàm tạo) - Dùng cho demo3
	public Person(String name, int tuoi, float cao) {
		this.name = name + " 123";
		this.tuoi = tuoi;
		this.cao = cao;
	}
	
	
	//phương thức "eat"
	public void eat(String food) {
		System.out.println(name + " an " + food);
	}
	
	//phương thức "soTuoi"
	public int soTuoi() {
		return tuoi;
	}
	
}

