package Wrapper;

public class MainClass {

	public static void main(String[] args) {
		
		//Chuyển kiểu nguyên thủy -> Wrapper (Boxing)
		int i = 30;
		Integer a = Integer.valueOf(i);
		Integer b = new Integer(i);		
		Integer c = i;					//Auto_Boxing (dùng cách này cho gọn)		
		
		System.out.println(a + " " + b + " " + c);
		
				
		
		//Chuyển kiểu Wrapper -> kiểu nguyên thủy (Unboxing)
		Integer ii = 40;
		int aa = ii.intValue();			
		int bb = ii;					//Auto_Unboxing

		System.out.println(aa + " " + bb);
		
		
		
		//.parseXxx(): Chuyển String -> int, float, ...
		String NUMBER = "1234";
		int number = Integer.parseInt(NUMBER);
		System.out.println(".parseXxx(): " + (number + 1));
		
		
		
		//.toString(): Chuyển int, float, ... -> String
		float SOTHUC = 4.5f;
		String sothuc = Float.toString(SOTHUC);
		System.out.println(".toString(): " + sothuc);
		
	}

}
