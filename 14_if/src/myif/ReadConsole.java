package myif;

import java.util.Scanner;

public class ReadConsole {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in); 		
		
		for (int i = 0; i < 2; i++) {
			System.out.print("number " + i + "=");
			//String line = in.nextLine();
			//System.out.println(line);
			
			//int num = in.nextInt();
			//System.out.println(num);
			
			float f = in.nextFloat();
			System.out.println(f);
		}

	}

}
