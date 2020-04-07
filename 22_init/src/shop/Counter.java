package shop;

public class Counter {


	public static final double CONST_PI = 3.142;
	
	public static int count = 0;

	public final int value = 123;
	
	public Counter() {
		count++;
	}

	public void test() {
		System.out.println(count);
		System.out.println(this.count);
	}
	
	public static void testStatic() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		System.out.println(count);

		/*final Counter counter = new Counter();
		counter.test();
		System.out.println(counter.count);

		System.out.println(Counter.count);

		System.out.println(counter.value);

		new Counter();
		new Counter();
		new Counter();
		new Counter();

		System.out.println(Counter.count);
		
		System.out.println("umfang " + 2 * CONST_PI * 10);
		
		//counter.value = 1234;*/
		
		Counter.testStatic();
		testStatic();
		Counter counter = new Counter();
		counter.testStatic();
	}
}
