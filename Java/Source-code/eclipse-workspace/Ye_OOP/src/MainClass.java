import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 // Khai báo đối tượng hinhTronA, từ lớp HinhTron
		HinhTron hinhTronA = new HinhTron();
		
		
		// Kêu người dùng nhập vào Bán kính Hình tròn, rồi truyền vào cho HinhTronA
		float bk;
		System.out.println("Nhap ban kinh hinh tron");
		bk = sc.nextFloat();
	
		hinhTronA.setBanKinh(bk);
		
		// Kêu người dùng nhập vào Tọa độ Hình tròn, rồi truyền vào cho HinhTronA, với 2 cách

//		int x, y;
//		System.out.println("Nhap toa do hinh tron");
//		System.out.println("Nhap x: ");
//		x = sc.nextInt();
//		System.out.println("Nhap y: ");
//		y = sc.nextInt();
//		hinhTronA.setToaDo(x, y);
		
		ToaDo toaDoA = new ToaDo();
		System.out.println("Nhap x: ");
		toaDoA.x = sc.nextInt();
		System.out.println("Nhap y: ");
		toaDoA.y = sc.nextInt();
		
		hinhTronA.setToaDo(toaDoA.x, toaDoA.y);
		hinhTronA.setToaDo(toaDoA);
		
		 // In kết quả vừa nhập
        hinhTronA.xuatBanKinh();
        hinhTronA.xuatToaDo();
	}

}
