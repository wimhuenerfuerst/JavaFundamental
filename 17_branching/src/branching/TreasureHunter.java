package branching;

import java.util.Random;
import java.util.Scanner;

public class TreasureHunter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dim=");
		int dim = scanner.nextInt();

		int[][][] field = new int[dim][dim][dim];

		Random random = new Random();
		field[random.nextInt(dim)][random.nextInt(dim)][random.nextInt(dim)] = 1;

		System.out.print("Stategy=");
		int strat = scanner.nextInt();

		if (1 == strat) {
			loop: for (int i = 0; i < dim; i++) {
				for (int j = 0; j < dim; j++) {
					for (int k = 0; k < dim; k++) {
						int v = field[i][j][k];
						
						if (v == 1) {
							System.out.println("x " + i);
							System.out.println("y " + j);
							System.out.println("z " + k);

							break loop;
						}
					}
				}
			}
		} else if (2 == strat) {
			System.out.print("Tries=");
			int maxTries = scanner.nextInt();
			int tries = 1;

			while (true) {
				int i = random.nextInt(dim);
				int j = random.nextInt(dim);
				int k = random.nextInt(dim);

				int v = field[i][j][k];

				if (v == 1) {
					System.out.println("x " + i);
					System.out.println("y " + j);
					System.out.println("z " + k);

					break;
				}
				
				if (tries >= maxTries) {
					System.out.println("you lost");
					break;
				}
				
				tries++;
			}
		}
		
		scanner.close();
	}

}
