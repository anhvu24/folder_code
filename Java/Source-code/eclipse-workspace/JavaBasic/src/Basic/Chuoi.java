package Basic;


public class Chuoi {

	public static void main(String[] args) {
		
		//Khai báo
		String root1 = "hello world";				//kiểu nguyên thủy
		String root2 = new String("hello WORLD");	//kiểu đối tượng
		
		
//SO SÁNH
		//bằng equals(), kết quả trả về là một kiểu boolean 
		root1.equals(root2);
		System.out.println("So sanh equals(): " + root1.equals(root2));		
		
		//bằng equalsIgnoreCase(), kiểu này không phân biệt chữ hoa-thường
		root1.equalsIgnoreCase(root2);
		System.out.println("So sanh equalsIgnoreCase(): " + root1.equalsIgnoreCase(root2));
		
	
//NỐI CHUỖI		
		//bằng '+'
		System.out.println("NỐI CHUỖi: " + root1 + root2);
		
		//bằng concat() (giống y như cái trên á mà)
		System.out.println("NỐI CHUỖi: " + root1.concat(root2));
		
		
//RÚT TRÍCH CHUỖI
		String root3 = "0123456789";
		
		//subString( startIndex ), rút Chuỗi con với nội dung bắt đầu từ chỉ số startIndex, bắt đầu từ 0
		System.out.println("RÚT TRÍCH CHUỖI: " + root3.substring(4));
		
		//subString( startIndex, endIndex )
		System.out.println("RÚT TRÍCH CHUỖI: " + root3.substring(3, 7));
	
		
//IN HOA - IN THƯỜNG
		//In hoa
		root1 = root1.toUpperCase();
		System.out.println("IN HOA: " + root1);
		
		//In thường		
		System.out.println("IN THƯỜNG: " + root2.toLowerCase());
		
		
//replace()
		String root4 = "Hello anh vu";
		root4 = root4.replace("Hello", "Hi");	//thay chữ "Hello" thành "Hi"
		System.out.println("replace(): " + root4);
		
	
//charAt() - tìm kí tự theo Index
		String root5 = "Thu Uyen";
		System.out.println("charAt(): " + root5.charAt(2));
		
		
//indexOf() - tìm Index theo kí tự
		String root6= "Helloh @ anh vu @";
		System.out.println("Vi tri dau tien cua @: " + root6.indexOf("@"));
		
		
	}

}
