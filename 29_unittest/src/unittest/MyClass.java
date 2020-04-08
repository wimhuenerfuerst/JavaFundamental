package unittest;

public class MyClass {

	int x;
	int y;

	public MyClass() {

	}

	public MyClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int addNumbers(int a, int b) {
		return a + b;
	}

	public MyClass build(int x, int y) {
		return new MyClass(x, y);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();

		int result = myClass.addNumbers(1, 2);

		if (result != 3) {
			throw new RuntimeException("Error");
		}
	}
}
