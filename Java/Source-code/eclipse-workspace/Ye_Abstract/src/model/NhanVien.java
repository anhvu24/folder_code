package model;

public abstract class NhanVien {

	protected String ten;
	protected long luong;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String ten) {
		this.ten = ten;
	}
	
	// p.thức abstract (có có khai báo abstract và ko có thân hàm)
	protected abstract String loaiNhanVien();
	
	// Lớp con PHẢI override để lo vụ tính lương này
	public abstract void tinhLuong();
	
	public void xuatThongTin() {
		System.out.println("Ten: " + ten);
		System.out.println("Loai nhan vien: " + loaiNhanVien());
		System.out.println("Luong: " + luong);		
	}
	
}
