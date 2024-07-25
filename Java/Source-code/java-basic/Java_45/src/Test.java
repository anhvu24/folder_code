
public class Test {
	public static void main(String[] args) {
		HangSanXuat hangA = new HangSanXuat("Hang A", "VN");
		HangSanXuat hangB = new HangSanXuat("Hang B", "VN2");
		HangSanXuat hangC = new HangSanXuat("Hang C", "VN3");
		
		
		PhuongTienDiChuyen p1 = new MayBay("May bay", hangC, "Xang may bay");
		MayBay p2 = new MayBay("May bay1", hangB, "Xang may bay1");
		
		System.out.println(p1.layVanToc());
		System.out.println(p2.layVanToc());
		
		
		
		p2.catCanh();
		System.out.println(p2.getLoaiNhienLieu());
		
		//ko thể dùng p1 để getLoaiNhienLieu()
		//vì trong lớp PhuongTienDiChuyen ko có pthuc đó 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
