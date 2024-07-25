package zzCodeNhiDongzz;

public class InSoNguyenTo {

	public static void main(String[] args) {
		//in số nguyên tố từ 1 đến 100
		//số nguyên tố là số chia hết cho 1 và chính nó
		
		int soNguyenTo;
		for(soNguyenTo = 1; soNguyenTo <= 100; soNguyenTo++) {
			int i, dem = 0;			//Lưu ý
			for(i = 1; i <= soNguyenTo; i++) {
				if(soNguyenTo % i == 0) {
					dem = dem + 1;
				}
			}
			if(dem == 2) {
				// Nếu dem là 2, tức là số đó chỉ chia hết cho hai số là 1 và chính nó
				System.out.println(soNguyenTo);
			}
		}
		
		
		
		

		/*
		 Lưu ý: biến 'i' có thể khai báo ở ngoài, nhưng 'dem' thì ko vì khai bào ở ngoài sẽ bị cộng dồn
		 			ở bài này mình đang cần cộng dồn 'dem' đến 2 để thực hiện điều kiện
		 
		*/
		
	}

}
