package invoke;

public class InvokeAndReadWrite {

	public String name;
	private String secret;

	public void printName() {
		System.out.println("Hello " + name);
	}

	private void printSecret() {
		System.out.println("Secret " + secret);
	}

	public InvokeAndReadWrite(String name, String secret) {
		super();
		this.name = name;
		this.secret = secret;
	}

}
