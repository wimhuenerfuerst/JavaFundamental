package myfor;

public class MyFor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("================");

		int i;

		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("i =" + i);
		System.out.println("================");

		for (; i < 20; i++) {
			System.out.println(i);
		}
		System.out.println("i =" + i);
		System.out.println("================");

		/*
		 * for (; ; ) { System.out.println(i); } System.out.println("i =" + i);
		 * System.out.println("================");
		 */

		/*
		 * for (int i = 0; i < 10; i++) { System.out.println(i); }
		 */

		for (i = 0; i < 100; i += 10) {
			System.out.println(i);
		}

		System.out.println("i = " + i);

		for (int x = 0, y = 0; x < 100 && y < 5; x += 10, y++) {
			System.out.println(x + y);
		}

		System.out.println("================");

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.println(x + y);
			}
		}
		
		System.out.println("================");

		int[] a = { 1, 2, 3, 4 };
		
		for (int j = 0; j < a.length; j++) {
			a[j] = a[j] + 10;
			System.out.println(a[j]);
		}
		
		System.out.println("================");
		
		for (int j : a) {
			System.out.println(j);
		}
		
		System.out.println("================");
	}
}
