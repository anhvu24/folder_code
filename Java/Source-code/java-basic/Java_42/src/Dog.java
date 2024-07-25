
public class Dog extends Animal{

	public Dog() {
		super("cho");
	}

	@Override
	public void eat() {
		System.out.println("Im eating xuong...");
		super.eat();
	}

	@Override
	public void makeSound() {
		System.out.println("gau gau");
		super.makeSound();
	}
	
	
	
	
	
	
	

}
