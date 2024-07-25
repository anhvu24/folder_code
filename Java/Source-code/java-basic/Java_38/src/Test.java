
public class Test {
	public static void main(String[] args) {
		
		QuocGia quocGia1 = new QuocGia("001", "Viet Nam");
		QuocGia quocGia2 = new QuocGia("002", "Han Quoc");
		
		NgaySanXuat ngay1 = new NgaySanXuat(1, 12, 2011);
		NgaySanXuat ngay2 = new NgaySanXuat(10, 1, 2013);
		
		HangSanXuat hang1 = new HangSanXuat("MSI", quocGia1);
		HangSanXuat hang2 = new HangSanXuat("G skill", quocGia2);
		
		MayTinh may1 = new MayTinh(hang1, ngay1, 1000, 12);
		MayTinh may2 = new MayTinh(hang2, ngay2, 2000, 24);

		System.out.println(may1.kiemTraGiaBanThapHon(may2));
		
		System.out.println(may1.layTenQuocGiaSanXuat());
		
		
		
		
		
		
		
		
	}
}
