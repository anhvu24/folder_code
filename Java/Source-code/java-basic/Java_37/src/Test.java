
public class Test {
	public static void main(String[] args) {
		NgaySinh ngay1 = new NgaySinh(12, 1, 1990);
		NgaySinh ngay2 = new NgaySinh(12, 1, 1990);

		Lop lop1 = new Lop("Lop 1", "Khoa CNTT");
		Lop lop2 = new Lop("Lop 45", "Khoa Du Lich");

		SinhVien sv1 = new SinhVien(11221, "Anh Vu", ngay1, 6.0, lop1);
		SinhVien sv2 = new SinhVien(1008, "Thu Uyn", ngay2, 3.0, lop2);

		
		
		System.out.println(sv1.layTenKhoa());
		
		System.out.println(sv2.kiemTraDau());
		
		System.out.println(sv1.kiemTraTrungNgaySinh(sv2));
		
		
		
	}
}
