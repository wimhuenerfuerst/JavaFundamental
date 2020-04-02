package mywhile;

import java.util.Scanner;

public class MyWhile {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			System.out.println(i);
			i++;			
		}
		
		/*while(true) {
			System.out.println(i);
		}*/
		
		boolean running = true;
		
		Scanner scanner = new Scanner(System.in);
		
		while(running) {
			System.out.print("enter value = ");
			int v = scanner.nextInt();
			
			/*if(v == 0) {
				running = false;
			}*/
			
			running = v != 0;		
		}
		
		i = 20;
		
		do {
			System.out.print(i);
		} while(i < 20);
		
		while(i < 20) {
			System.out.print(i);
		}
	}

}
