
public class CongNhan extends CanBo {
	private int capBac;

	public CongNhan(String hoTen, String gioiTinh, String diaChi, int tuoi, int capBac) {
		super(hoTen, gioiTinh, diaChi, tuoi);
		this.capBac = capBac;
	}

	public int getCapBac() {
		return capBac;
	}

	public void setCapBac(int capBac) {
		this.capBac = capBac;
	}
	
	
}
