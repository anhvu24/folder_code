package Basic;

import java.util.ArrayList;
import java.util.List;

public class DanhSach {

	public static void main(String[] args) {
		/*
		 	+ List là 1 Interface
		 	+ List<...>
		 	+ add() - thêm một phần tử vào list
			+ addAll() – thêm tất cả các phần tử của một list này vào list khác
			+ get() – giúp truy cập ngẫu nhiên các phần tử từ list
			+ iterator() – trả về đối tượng iterator có thể được sử dụng để truy cập tuần tự các phần tử của list
			+ set() – thay đổi các phần tử của list
			+ remove() – xóa một phần tử khỏi list
			+ removeAll() – loại bỏ tất cả các phần tử khỏi list
			+ clear()- loại bỏ tất cả các phần tử khỏi list (hàm này hiệu quả hơn hàm removeAll())
			+ size() – trả về độ dài của list
			+ toArray() – chuyển đổi một list thành một mảng
			+ contains()- trả về true nếu một list chứa phần tử được chỉ định
		 
		 */
		
		List<String> Ten = new ArrayList<>();
		
		//add() - Thêm dữ liệu vào List
		Ten.add("Anh Vu");		
		Ten.add("Thu Uyen");
		Ten.add("Anh Vu va Thu Uyen");
		System.out.println("Danh sach co: " + Ten);
		
		
		//remove() - Xóa dữ liệu
		Ten.remove(0);
		System.out.println("Sau khi xóa: " + Ten);
		
		
		//size() - Kích cỡ của List
		System.out.println("List có kích cỡ: " + Ten.size());
		
		
		//toArray() - Chuyển đổi một List thành một Mảng				
		Object[] a = Ten.toArray();		//tạo mảng a từ lớp Object
		for(int i = 0; i < Ten.size(); i++) {
			System.out.println("Chuyển List thành mảng và In: " + a[i]);
		}
		
		
		//Dùng ForEach để in theo mảng
		for (String ten : Ten) {
			System.out.println("Dùng ForEach để in theo mảng: " + ten);
		}
		

	}

}
