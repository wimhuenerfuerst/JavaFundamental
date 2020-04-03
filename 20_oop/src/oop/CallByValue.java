package oop;

public class CallByValue {

	public void manipulate(int x) {
		x++;
		System.out.println("manipulate x " + x);
	}
	
	public void manipulate(Customer x) {
		x = new Customer();
		x.name = "test";
		System.out.println("manipulate customer " + x);
	}

	public static void main(String[] args) {
		CallByValue callByValue = new CallByValue();
		
		int x = 1;
		
		callByValue.manipulate(x);
		
		System.out.println(x);

		Customer customer = new Customer();
		
		System.out.println(customer);
		
		callByValue.manipulate(customer);
		
		System.out.println(customer);
		
	}

}
