
public class Main {

	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		String c = "hbd";
		
		System.out.println(a + b + c);
		
		StringBuilder builder = new StringBuilder();
		builder.append(a);
		builder.append(b);
		builder.append(c);
		
		System.out.println(builder.toString());
		
		StringBuffer stringBuffer = new StringBuffer();
	}

}
