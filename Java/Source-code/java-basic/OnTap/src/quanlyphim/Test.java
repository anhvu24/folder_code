package quanlyphim;

public class Test {
	public static void main(String[] args) {
		HangSanXuat hangA = new HangSanXuat("QQQ", "VN");
		HangSanXuat hangB = new HangSanXuat("AAA", "VN2");
		
		
		NgayChieu ngay1 = new NgayChieu(11, 13, 2002);
		NgayChieu ngay2 = new NgayChieu(1, 1, 2001);

		Phim phim1 = new Phim("Phim A", 2002, hangA, 200, ngay1);
		Phim phim2 = new Phim("Phim B", 2002, hangB, 1991, ngay2);
		
		
		System.out.println(phim2.soSanhGiaVeReHon(phim1));
		
		System.out.println("Ten hang san xuat phim1: " + phim1.layTenHangSanXuat());
		
		System.out.println("Gia ve sau KM cua phim1: " + phim1.layGiaVeSauKhuyenMai(10));
		
		
		
		
		
		
		
		
		
	}
}
