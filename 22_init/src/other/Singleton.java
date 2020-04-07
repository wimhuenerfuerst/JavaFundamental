package other;

public class Singleton {

	private static Singleton instance = new Singleton(); // eager

	private int value = 123;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) { // lazy
			instance = new Singleton();
		}

		return instance;
	}

	public int getValue() {
		return value;
	}

}
