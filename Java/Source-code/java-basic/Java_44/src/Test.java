
public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(1, 3);

		HinhChuNhat hcn = new HinhChuNhat(td1, 3, 2);

		System.out.println("Dien tich hcn: " + hcn.tinhDienTich());

	}
}
