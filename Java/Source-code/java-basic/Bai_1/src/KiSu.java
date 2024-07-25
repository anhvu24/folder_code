
public class KiSu extends CanBo {
	private String nganhDaoTao;

	public KiSu(String hoTen, String gioiTinh, String diaChi, int tuoi, String nganhDaoTao) {
		super(hoTen, gioiTinh, diaChi, tuoi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

}
