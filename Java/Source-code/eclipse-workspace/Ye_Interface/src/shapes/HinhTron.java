package shapes;

public class HinhTron implements HinhHoc {

	protected String ten;
    protected float banKinh;
	
    //Constructor
    public HinhTron(float banKinh) {
    	this.ten = "Hinh Tron";
    	this.banKinh = banKinh;
    }
    
	@Override
	public float tinhChuVi() {
		return 2 * PI * banKinh;
	}

	@Override
	public float tinhDienTich() {
		return PI * banKinh * banKinh;
	}

	@Override
	public float tinhTheTich() {
		return 0;
	}

	@Override
	public void xuatThongTin() {
		System.out.println(ten);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());	
	}

}
