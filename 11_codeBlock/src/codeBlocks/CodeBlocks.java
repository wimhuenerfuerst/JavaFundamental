package codeBlocks;

public class CodeBlocks {

	public static void main(String[] args) {
		int i = 1;
		
		//int c = 2; geht nicht		
		{
			//int i = 1; geht nicht
			int c = 2;
		}
		
		int c = 2;
		
		System.out.println(c);		
	}
}
