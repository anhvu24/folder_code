
public class Test {
	public static void main(String[] args) {

		HangSanXuat hang1 = new HangSanXuat("Anh Vu", "Viet Nam");
		HangSanXuat hang2 = new HangSanXuat("Anh Vu2", "Viet Nam2");

		NgayChieu ngay1 = new NgayChieu(12, 1, 2020);
		NgayChieu ngay2 = new NgayChieu(1, 10, 2022);

		Phim phim1 = new Phim("phim 1", 2012, hang1, 100, ngay1);
		Phim phim2 = new Phim("phim 2", 2000, hang2, 1000, ngay2);

		System.out.println("Gia ve phim 1 re hon phim 2: " + phim1.kiemTraGiaVe(phim2));

		System.out.println("Ten hang san xuat phim 1: " + phim1.layTenHangSanXuat());

		System.out.println("Gia ve phim 1 sau khi khuyen mai 20%: " + phim1.giaVeSauKhuyenMai(20));

	}
}
