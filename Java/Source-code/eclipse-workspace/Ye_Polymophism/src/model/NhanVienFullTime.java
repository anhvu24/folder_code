package model;

import util.Configs;

public class NhanVienFullTime extends NhanVien {

	private int loaiChucVu;
	private int ngayLamThem;
	
	
	public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
		super(ten);
		this.ngayLamThem = ngayLamThem;
		this.loaiChucVu = loaiChucVu;
	}
	
	@Override
	public String loaiNhanVien() {
		if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
			return "Nhan vien fulltime linh " + (ngayLamThem > 0 ? "co lam them" : "");
		} else {
			return "Nhan vien fulltime sep " + (ngayLamThem > 0 ? "co lam them" : "");
		}
	}
	
	@Override
	public void tinhLuong() {
		if(loaiChucVu == Configs.NHAN_VIEN_LINH) {
			luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
		}else {
			luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
		}
	}
	
}
