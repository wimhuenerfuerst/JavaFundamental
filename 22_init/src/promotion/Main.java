package promotion;

public class Main {

	public void test1(int n) {
		System.out.println("Test int " + n);
	}
	
	public void test1(int a, int b) {
		System.out.println("Test int " + (a + b));
	}
	
	public void test1(float n) {
		System.out.println("Test float " + n);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.test1(123);
		main.test1(123, 123);
		main.test1(123f);
		
		short s = 123;
		
		main.test1(s);
		
		long l = 123;
		
		main.test1(l);
	}

}
