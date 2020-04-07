package boxing;

import java.util.Optional;

public class Boxing {

	int value;

	public Boxing(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		int i = 67434378;
		
		Integer integer1 = new Integer(12345);
		integer1 = 9876; // autoboxing
		integer1 = i; // autoboxing
		
		i = integer1; // autounboxing
		
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		
		int v1 = 129;
		int v2 = 100;
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1 == v1);
		
		//Optional<Integer> optional = Optional.of(123);
	}

}
