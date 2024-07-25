package Main;

import model.NhanVienFullTime;
import model.NhanVienPartTime;
import util.Configs;

public class MainClass {

	public static void main(String[] args) {
		
		// Công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào
		NhanVienFullTime sep_1 = new NhanVienFullTime("Anh Vu");
			sep_1.setLoaiChucVu(1);
		NhanVienFullTime linh_1 = new NhanVienFullTime("Uyen");
			linh_1.setLoaiChucVu(2);
		NhanVienFullTime linh_2 = new NhanVienFullTime("Xuan", 2);
			linh_2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);						//set nhân viên cách này cũng đc
		
		// Công ty đang thuê 1 nhân viên thời vụ
		NhanVienPartTime pt_1 = new NhanVienPartTime("Hai", 10);
		
		// Tính lương cho nhân viên
		sep_1.tinhLuong();
		linh_1.tinhLuong();
		linh_2.tinhLuong();
		
		pt_1.tinhLuong();
		
		 // In thông tin nhân viên
		sep_1.xuatThongTin();
		linh_1.xuatThongTin();
		linh_2.xuatThongTin();
		pt_1.xuatThongTin();
		
	}

}
