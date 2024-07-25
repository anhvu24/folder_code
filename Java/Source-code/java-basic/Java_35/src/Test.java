
public class Test {
	public static void main(String[] args) {

		Ngay ngay1 = new Ngay(11, 2, 2000);
		Ngay ngay2 = new Ngay(12, 3, 2002);
		Ngay ngay3 = new Ngay(13, 4, 2002);

		TacGia tacGia1 = new TacGia("Anh Vu", ngay1);
		TacGia tacGia2 = new TacGia("Thu Uyen", ngay2);
		TacGia tacGia3 = new TacGia("Anh Uyen", ngay3);

		Sach sach1 = new Sach("Tieng Anh", 1000, 1990, tacGia1);
		Sach sach2 = new Sach("Toan", 100, 1994, tacGia2);
		Sach sach3 = new Sach("Ly", 1600, 1997, tacGia3);

		sach1.inTenSach();
		
		System.out.println(sach1.kiemTraCungNam(sach3));

		System.out.println("Gia sau khi giam 30% cua sach 1: " + sach1.giaSauKhiGiam(30));

	}
}
