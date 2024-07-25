package model;

import util.Configs;

public class NhanVienPartTime extends NhanVien {

	private int gioLamViec;
	
	public NhanVienPartTime(String ten, int gioLamViec) {
		super(ten);
		this.gioLamViec = gioLamViec;
	}
	
	@Override
	public String loaiNhanVien() {
		return "Nhan vien parttime";
	}
	
	@Override
	public void tinhLuong() {
		luong = gioLamViec * Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
	}
}
