package Basic;


public class Mang {

	public static void main(String[] args) {
		

        int[] myArray = new int[5];
 
        myArray[0] = 10;
        myArray[1] = 14;
        myArray[2] = 36;
        myArray[3] = 27;
        myArray[4] = 18;

        // In ra màn hình Console số phần tử của mảng.
        System.out.println("Array Length=" + myArray.length);
 
        // In ra phần tử tại chỉ số 3 (Phần tử thứ 4 trong mảng)
        System.out.println("myArray[3]=" + myArray[3]);
 
        // Sử dụng vòng lặp for để in ra các phần tử trong mảng.
        
  /*      for (int index = 0; index < myArray.length; index++) 
            System.out.println("Element " + index + " = " + myArray[index]); 		*/
		
        
        
        int a; 
		for(a = 0; a < 5; a++) {
			System.out.println("Element " + a + " = " + myArray[a]);
		}
			
	
	
        
	}

}
