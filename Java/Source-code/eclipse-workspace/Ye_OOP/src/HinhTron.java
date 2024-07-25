

public class HinhTron {

	float r;
	ToaDo toaDo;
	
	
	// Phương thức này có một tham số truyền vào là kiểu nguyên thủy
	void setBanKinh(float r) {
		this.r = r;
	}
	
	// Phương thức này có một tham số truyền vào là kiểu đối tượng
	void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	 // Phương thức này có hai tham số truyền vào
	void setToaDo(int x, int y) {
		this.toaDo = new ToaDo();		
		this.toaDo.x = x;
		this.toaDo.y = y;
	}
	
	void xuatBanKinh() {
		System.out.println("Ban kinh da nhap: " + this.r);
	}
	
	void xuatToaDo() {
		System.out.println("Toa do: ");
		System.out.println("x: " + this.toaDo.x);
		System.out.println("y: " + this.toaDo.y);
	}
	
	
}
