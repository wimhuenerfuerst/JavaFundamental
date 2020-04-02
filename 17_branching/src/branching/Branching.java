package branching;

public class Branching {

	public static void main(String[] args) {
		int i = 0;
		
		while(true) {			
			i++;
			
			if(i % 2 == 0) {
				continue;
			}
			
			if(i >= 10) {
				break;
				//return;
			}
			
			System.out.println(i);
		}
		
		outer: for (int j = 0; j < 3; j++) {
			inner: for (int j2 = 0; j2 < 3; j2++) {
				int k = j * j2;
				
				if(k == 2) {
					continue inner;
				}
				
				System.out.println(j + " " + j2);
			}
		}
		
		//System.out.println("end");
	}

}
