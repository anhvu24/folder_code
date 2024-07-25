
public class HoaDonCaPhe {
	private String tenCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public HoaDonCaPhe(String ten, double gia, double kl) {
		this.tenCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kl;
	}

	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}

	public boolean kiemTraKhoiLuongLonHon(double khoiLuongNhap) {
//		if (this.khoiLuong > khoiLuongNhap) {
//			return true;
//		} else {
//			return false;
//		}
		return this.khoiLuong > khoiLuongNhap;
	}

	public boolean kiemTraTongTienLonHon500k() {
		return this.tinhTongTien() > 500;
	}

	public double giamGia(double x) {
		if (this.tinhTongTien() > 500) {
			return this.tinhTongTien() * x / 100;
		} else {
			return 0;
		}
	}
	
	public double tinhTienKhachTraSauGiamGia(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
	
	
	

}
