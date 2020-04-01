package datatypes;

import java.util.Random;

public class Datatypes {
	
	public static void main(String[] args) {
		Random random = new Random(); // object refrence

		int a; // declararion

		a = 7; // assigment

		float f;
		double d;

		int b = 8;

		int x1, y1, z1;
		int x = 1, y = 2, z = 3;

		System.out.println(a);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		long o = -2147483649L;
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		float f2 = 1.4E-45F;
		
		boolean b1 = true;
		boolean b2 = false;
		
		int binary = 0b110101;
		int oct = 0177777;
		int hex = 0x1FFF;
		
		System.out.println(binary);
		System.out.println(oct);
		System.out.println(hex);
		
		
		int i1 = 1234;
		long l1 = i1;
		
		l1 = 2147483649L;
		
		i1 = (int) l1;
		
		System.out.println(i1);
		
		int age = 18;
		int $age = 18;
		int _age = 18;
		
		int _age2 = 18;
		int _age$ = 18;
		
		//int 3age;
		//int age%;
		
		int Age1;
		int age1;
		int AgE;
		
		int helloWorld;
	
		int mio = 1_0_0_0_0_0_0;
		
		System.out.println(mio);
		
		int a1 = 1 + (2 * 3);
		
		System.out.println(a1);
		
		int vPost = 1;			
		
		System.out.println(vPost++);
		System.out.println(vPost);
		
		int vPre = 1;			
		
		System.out.println(++vPre);
		System.out.println(vPre);
		
		int a0 = (2 * 3);
		a1 = 1 + a0;
	}

}
