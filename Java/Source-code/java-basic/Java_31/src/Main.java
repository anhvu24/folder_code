
public class Main {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100, 1.6);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Anh Vu", 200, 10);

		System.out.println("Tong tien hd: " + hd.tinhTongTien());
		System.out.println("Tong tien hd2: " + hd2.tinhTongTien());
		
		System.out.println("Kiem tra kluong: " + hd.kiemTraKhoiLuongLonHon(1));
		System.out.println("Kiem tra lon hon 500k: " + hd.kiemTraTongTienLonHon500k());

		System.out.println("Giam gia cua hd: " + hd.giamGia(10));
		System.out.println("Giam gia cua hd2: " + hd2.giamGia(10));
		
		System.out.println("Sau Giam gia cua hd: " + hd.tinhTienKhachTraSauGiamGia(10));
		System.out.println("Sau Giam gia cua hd2: " + hd2.tinhTienKhachTraSauGiamGia(10));

	}
}
