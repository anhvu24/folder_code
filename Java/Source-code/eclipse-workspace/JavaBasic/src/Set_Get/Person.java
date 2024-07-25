package Set_Get;

public class Person {

	String name; 
	private int tuoi;
	
	public Person(String name, int tuoi) {
		this.name = name;
		this.tuoi = tuoi;
	}
	
	//SET - ở đây ta set đkiện cho tuổi 
	public void setTuoi(int tuoi) {
		if(tuoi > 0 && tuoi < 100) {
			this.tuoi = tuoi;
		}
	}
	
	
	//GET	
	public int getTuoi() {
		return this.tuoi;
	}
	
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.tuoi);
		
	}
	
}
