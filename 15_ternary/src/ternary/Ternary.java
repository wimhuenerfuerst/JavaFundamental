package ternary;

public class Ternary {

	public static void main(String[] args) {
		int x = 11;
		int y;
		
		if(x == 10) {
			y = 1;
		} else {
			y = 2;
		}
		
		System.out.println(y);
		
		y = (x == 10) ? 1 : 2;
		
		//y = x == 10 ? "xyz" : 2; geht nicht
		
		System.out.println(y);
		
		//y = x == 10 ? System.out.println(y) : 2; geht nicht
		
		System.out.println(x == 10 ? 1 : 2);
		
		System.out.println(x == 10 ? "xzy" : 2);
		
		y = x == 10 ? 1 : x == 5 ? 2 : 3;
		System.out.println(y);
	}

}
