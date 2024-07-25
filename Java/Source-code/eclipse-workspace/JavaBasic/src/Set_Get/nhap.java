package Set_Get;

public class nhap {

	public static void main(String[] args) {
		
		Person a = new Person("Thu Uyen", 12);
		
		int tuoiA = a.getTuoi();
		System.out.println(tuoiA);
		
		
		a.setTuoi(18);						//set vào tuổi mới
		System.out.println(a.getTuoi());	//in ra tuổi mới
		

		a.info();
		
	}

}
