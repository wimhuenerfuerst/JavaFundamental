package other;

import static shop.Counter.*;

public class Main {

	public static void main(String[] args) {
		//Counter.testStatic();
		testStatic();
		System.out.println(CONST_PI);
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getValue());
	}

}
