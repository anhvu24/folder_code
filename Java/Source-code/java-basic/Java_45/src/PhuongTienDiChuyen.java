
public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat;

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public String layTenHangSanXua() {
		return this.hangSanXuat.getTenHangSanXuat();
	}

	public void batDau() {
		System.out.println("bat dau ne");
	}

	public void tangToc() {
		System.out.println("tang toc thoi");

	}

	public void dungLai() {
		System.out.println("dung lai thuiii");
	}

	public abstract double layVanToc();

}
