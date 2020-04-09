package table;

public class Main {

	public static class Test1 {
		static void test() {

		}

		static void testHidden() {

		}
	}

	public static class Test2 extends Test1 {

		static void testHidden() {

		}
	}

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		dog.walk();

		Cat cat = new Cat();
		cat.eat();
		cat.sound();

		Animal animal = dog;
		animal.sound();
		animal.eat();

		Lifeform lifeform = dog;
		lifeform.eat();

		FourLegged fourLegged = dog;
		fourLegged.walk();

		dog = (Dog) animal;
		dog.eat();

		animal = dog;

		if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.eat();
		} else {
			System.out.println("this is not a dog you idiot");
		}

		System.out.println(Animal.ABC3); // gut
		System.out.println(animal.ABC3); // schlecht

		System.out.println(Dog.ABC3); // gut
		System.out.println(dog.ABC3); // schlecht
		System.out.println(Dog.ABC2); // schlecht

		Animal.jump();
		// animal.jump(); geht nicht
		// Dog.jump(); geht nicht
		// dog.jump(); geht nicht

		Test1 test1 = new Test1();
		Test1.testHidden(); // gut
		test1.testHidden(); // schlecht, aber geht
		Test1.test(); // gut
		test1.test(); // schlecht, aber geht

		Test2 test2 = new Test2();
		Test2.test(); // schlecht, aber geht
		test2.test(); // schlecht, aber geht
		Test1.testHidden(); // gut (?)
		test2.testHidden(); // schlecht, aber geht

		dog.fly();
		animal.fly();
		cat.fly();
	}

}
