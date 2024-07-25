package Ly_thuyet;

// outer class
public class HinhHoc {
	
	public static final float PI = 3.14f;
	
	public String ten;
	public ToaDo toaDo;
	
	
	//constructor
	public HinhHoc(int x, int y) {
		this.ten = "Hinh Hoc";
		
		this.toaDo = new ToaDo();
		this.toaDo.x = x;
		this.toaDo.y = y;		
	}
	
	//inner class
	public class ToaDo {
		
		int x; 
		int y;
		
		void xuatThongTin() {
		    System.out.println("Hình: " + ten);
            System.out.println("Tọa độ: x = " + x + "; y = " + y);
		}
		
	}
	
		
}
