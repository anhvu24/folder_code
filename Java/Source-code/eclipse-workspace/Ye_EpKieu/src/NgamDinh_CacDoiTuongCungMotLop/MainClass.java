package NgamDinh_CacDoiTuongCungMotLop;

public class MainClass {

	public static void main(String[] args) {
		
		Number a = new Number();
		Number b = new Number();
		
		a.setNumber(1);
		b.setNumber(2);
		
//		a = b;				//Run, xong bật cái này lên
		
//		b.setNumber(4);		//Sau đó đến cái này
		
		System.out.println(a.getNumber());
		System.out.println(b.getNumber());
		
	}

}


/* Hệ thống sẽ ép kiểu dữ liệu, và cả tham chiếu, của cả hai 
 * đối tượng vào nhau làm cho chúng giờ đây trở thành một
 * 
 * Điều này khác hoàn toàn với việc sử dụng phép gán ở kiểu dữ liệu nguyên thủy, 
 * bạn hãy ghi nhớ điều này nhé.
 * */
