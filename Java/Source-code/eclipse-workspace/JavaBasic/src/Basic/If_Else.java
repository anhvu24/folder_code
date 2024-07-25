package Basic;

public class If_Else 
{

	public static void main(String[] args) 
	{
		
		int tuoi = 60;
		if(tuoi < 17) {
			System.out.println("nho hon 17 tuoi");
		}		
		else if(tuoi == 18) {
			System.out.println("bang 18 tuoi");
		}
		else if(tuoi > 18 && tuoi < 40) {
			System.out.println("18 < tuoi < 40");
		}
		else {
			if(!(tuoi == 50)) {// = if(tuoi != 50);
				System.out.println("kO phai 50 tuoi");
			}
			if(tuoi == 60 || tuoi == 70) {
				System.out.println("Tuoi cao");
			}
		}
        
	}
}
