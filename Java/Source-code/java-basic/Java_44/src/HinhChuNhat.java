
public class HinhChuNhat extends Hinh {
	private int chieuRong, chieuDai;

	public HinhChuNhat(ToaDo toaDo, int chieuRong, int chieuDai) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuDai = chieuDai;
	}

	@Override
	public double tinhDienTich() {
		return this.chieuRong * this.chieuDai;
	}

}
