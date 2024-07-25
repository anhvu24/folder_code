package shapes;

interface HinhHoc {
	// Trong Interface ko tạo Constructor được
	
	float PI = 3.14f; // Mặc định thì các thuộc tính bên trong interface sẽ là public, static và final

	float tinhChuVi();	// Mặc định thì các phương thức bên trong interface sẽ là abstract và public
	
	float tinhDienTich();
	
	float tinhTheTich();
	
	void xuatThongTin();
	
	
}
