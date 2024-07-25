
public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private NgaySinh ngaySinh;
	private double diemTrungBinh;
	private Lop lop;

	public SinhVien(int maSinhVien, String hoTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}

	public boolean kiemTraDau() {
		return this.diemTrungBinh > 5;
	}
	
//	public boolean kiemTraTrungNgaySinh(SinhVien sinhVienKhac) {
//		return this.ngaySinh.getNgay() == sinhVienKhac.ngaySinh.getNgay();
//	}
	

	public boolean kiemTraTrungNgaySinh(SinhVien sinhVienKhac) {
	return this.ngaySinh.equals(sinhVienKhac.ngaySinh);
}
	
	
	
}
