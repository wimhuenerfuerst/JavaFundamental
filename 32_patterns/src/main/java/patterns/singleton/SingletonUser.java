package patterns.singleton;

public class SingletonUser {

	private EagerSingleton eagerSingleton;

	public SingletonUser(EagerSingleton eagerSingleton) {
		super();
		this.eagerSingleton = eagerSingleton;
	}
	
	public SingletonUser() {
		super();
		this.eagerSingleton = EagerSingleton.getInstance();
	}

	public static void main(String[] args) {
		/*EagerSingleton eagerSingleton = new EagerSingleton();
		
		SingletonUser singletonUser1 = new SingletonUser(eagerSingleton);
		SingletonUser singletonUser2 = new SingletonUser(eagerSingleton);*/
		
		SingletonUser singletonUser1 = new SingletonUser();
		SingletonUser singletonUser2 = new SingletonUser();
	}

}
