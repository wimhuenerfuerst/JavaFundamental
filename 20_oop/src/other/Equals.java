package other;

public class Equals {

	public static void main(String[] args) {
		String s1 = "123"; //new String("xyz");
		String s2 = "123"; //new String("xyz");

		if (s1 == s2) {
			System.out.println("gleich");
		} else {
			System.out.println("ungleich");
		}

		if (s1.equals(s2)) {
			System.out.println("eq gleich");
		} else {
			System.out.println("eq ungleich");
		}

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("eq gleich");
		} else {
			System.out.println("eq ungleich");
		}
	}
}
