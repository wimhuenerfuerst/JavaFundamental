package table;

public interface Animal extends Lifeform {

	static final String ABC = "Hello1";

	static String ABC1 = "Hello2"; //public static final per default

	final String ABC2 = "Hello3"; //public static final per default

	String ABC3 = "Hello4"; //public static final per default

	void sound(); //public abstract per default
	
	static void jump() { //abstract geht nicht bei static
		System.out.println("jumps");
	}
	
	default void fly() { //abstract geht nicht bei default
		System.out.println("fly my animal! fly!");
	}
}
