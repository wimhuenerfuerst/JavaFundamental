package myif;

public class MyIf {

	public static void main(String[] args) {

		int i = 1;

		if (i == 0) {
			System.out.println("gleich");
		}

		if (i != 0) {
			System.out.println("ungleich");
		}

		int j = 1;

		if (i == 1 && j == 1) {
			System.out.println("match");
		}

		boolean c1 = i == 1;
		boolean c2 = j == 1;
		boolean c3 = c1 && c2;

		if (c3) {
			System.out.println("match");
		}

		if (!c3)
			;
		System.out.println("123 match");

		if (i == 0) {
			System.out.println("if gleich");
		} else {
			System.out.println("else ungleich");
		}

		i = 10;
		
		int k;

		if (false) {
			System.out.println("<5");
			
			System.out.println(k);
		} else if (1 != 1) {
			System.out.println("<10");
			
			System.out.println(k);
		} else {
			System.out.println(i);
			
			int x = 10;
			
			//System.out.println(k);
		}

		System.out.println("end");
	}
}
