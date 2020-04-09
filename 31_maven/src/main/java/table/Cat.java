package table;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("eats fish and birds");
	}

	@Override
	public void sound() {
		System.out.println("meow");
	}

}
