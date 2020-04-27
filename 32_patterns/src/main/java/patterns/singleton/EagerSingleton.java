package patterns.singleton;

public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();

	private int counter;

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return instance;
	}

	public void add() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
		EagerSingleton.getInstance().add();
		EagerSingleton.getInstance().add();
		EagerSingleton.getInstance().add();
		EagerSingleton.getInstance().add();
		System.out.println(EagerSingleton.getInstance().getCounter());
	}

}
