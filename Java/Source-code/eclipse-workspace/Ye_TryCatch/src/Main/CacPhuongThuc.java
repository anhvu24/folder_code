package Main;

public class CacPhuongThuc {

	public static void main(String[] args) {
	
		//getMessage(): trả về một String mô tả về Exception vừa xảy ra
		try {
			int a[] = {1,2,3,4};
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		

		
		//toString(): Trả về tên của lớp Exception đang tung ra lỗi, kèm với nội dung của phương thức getMessage()
		try {
			int a[] = {1,2,3,4};
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		

		
		//printStackTrace(): in ra nội dung của phương thức toString() trên kia, kèm với các dòng log dạng Stack Trace nữa.
		try {
			int a[] = {1,2,3,4};
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
