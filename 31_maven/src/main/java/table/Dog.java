package table;

public class Dog implements Animal, FourLegged {

	public static final String ABC3 = "dog Hello4"; // public static final per default

	@Override
	public void sound() {
		System.out.println("woof");
	}

	@Override
	public void walk() {
		System.out.println("walking on four legs");
	}

	@Override
	public void eat() {
		System.out.println("eats meat");
	}

	@Override
	public void fly() {
		System.out.println("dogs dont fly");
	}	
}
