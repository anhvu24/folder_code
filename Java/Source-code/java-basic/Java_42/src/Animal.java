
public class Animal {
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Im eating ....");
	}

	public void makeSound() {
		System.out.println("sound ....");

	}

	public void sleep() {
		System.out.println("hzzzzzzzzzz .......");
	}

}
