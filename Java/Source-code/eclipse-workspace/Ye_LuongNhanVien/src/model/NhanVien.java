package model;

public class NhanVien {

	protected String ten;
	protected long luong;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String ten) {
		this.ten = ten;
	}
	
	protected String loaiNhanVien() {
		return "";
	}
	
	public void xuatThongTin() {
		System.out.println("Ten: " + ten);
		System.out.println("Luong: " + luong);
		System.out.println("loai: " + loaiNhanVien());
	}
}
