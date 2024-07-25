package Class_Demo;

public class Demo1 
{

	public static void main(String[] args) 
	{
		//tạo mới 1 đối tượng (instance) a
		Person a = new Person();	//p.thức khởi tạo (constructor)
		a.name = "vui";
		a.tuoi = 12;
		a.cao = 1.3f;
		
		System.out.println(a.name);
		System.out.println(a.tuoi);
		System.out.println(a.cao);
	}

}


