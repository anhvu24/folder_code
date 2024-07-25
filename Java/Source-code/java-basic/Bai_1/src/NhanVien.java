
public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String hoTen, String gioiTinh, String diaChi, int tuoi, String congViec) {
		super(hoTen, gioiTinh, diaChi, tuoi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

}
