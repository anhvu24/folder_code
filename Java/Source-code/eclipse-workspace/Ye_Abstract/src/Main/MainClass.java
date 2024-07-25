package Main;
import java.util.Scanner;

import model.NhanVien;
import model.NhanVienFullTime;
import model.NhanVienPartTime;

public class MainClass {

	public static void main(String[] args) {
		
		// Kêu người dùng nhập vào số lượng nhân viên trong công ty
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số lượng nhân viên: ");
        int tongNhanVien = Integer.parseInt(scanner.nextLine());
         
        // Khai báo mảng các nhân viên
        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < tongNhanVien; i++) {
            // Khai báo từng loại nhân viên, và kêu người dùng nhập thông tin nhân viên
            System.out.print("Tên nhân viên " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Là nhân viên (1-Toàn thời gian; 2-Bán thời gian): ");
            int laNhanVien = Integer.parseInt(scanner.nextLine());
            if (laNhanVien == 1) {
                // Nhân viên toàn thời gian
                System.out.print("Chức vụ nhân viên (1-Sếp; 2-Lính): ");
                int chucVu = Integer.parseInt(scanner.nextLine());
                System.out.print("Ngày làm thêm (nếu có): ");
                int ngayLamThem = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
            } else {
                System.out.print("Giờ làm: ");
                int gioLamViec = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
            }
        }
         
        System.out.println("\nKết quả tính lương\n");
         
        // Tính lương và xuất thông tin nhân viên
        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.tinhLuong();
            nhanVien.xuatThongTin();
        }

        
	}
}
