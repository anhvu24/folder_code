package Basic;

public class For_Each {

	public static void main(String[] args) {
		
		int[] array = {1,3,4};
		
		for (int b : array) {
			System.out.println(b);
				
		}
	}
}


/*
 Giới hạn For-each
 + KO thể chỉnh sửa mảng, chỉ được dùng để duyệt các phần tử trong mảng
 + KO thể tìm đc vị trí trong mảng
 + KO thể chạy ngược mảng
 
*/