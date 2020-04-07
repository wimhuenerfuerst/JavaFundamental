package misc;

public class VarArgs {
	
	public static void print(String ... array) {
		System.out.println("var print");
		
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	public static void print(String a, String b, String c) {
		System.out.println("print");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		print("eins", "zwei", "drei");
		print(new String[] {"eins", "zwei", "drei"});
	}

}
