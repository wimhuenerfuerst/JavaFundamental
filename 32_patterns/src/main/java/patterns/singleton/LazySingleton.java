package patterns.singleton;

public class LazySingleton {

	private static LazySingleton instance;

	private int counter;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {

		if (instance == null) {
			instance = new LazySingleton();
		}

		return instance;
	}

	public void add() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
		LazySingleton.getInstance().add();
		LazySingleton.getInstance().add();
		LazySingleton.getInstance().add();
		LazySingleton.getInstance().add();
		System.out.println(LazySingleton.getInstance().getCounter());
	}

}
