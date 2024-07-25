package test;

//import code_a.ViDu;

public class Test {
	public static void main(String[] args) {
//		ViDu vdA = new ViDu(3, 4);
//		System.out.println(vdA.getA());
		
		// hoặc có thể làm như thế này:
		code_a.ViDu vdA = new code_a.ViDu(6, 4);
		System.out.println(vdA.getA());
		
		code_b.ViDu vdB = new code_b.ViDu(1, 6, 8);
		System.out.println(vdB.getA());
		
		
		
	}
}
