package fourwins;

import java.util.Scanner;

public class FourWins {

	public static void main(String[] args) {
		int dimRow = 6;
		int dimCol = 7;

		int[][] field = new int[dimCol][dimRow];

		Scanner scanner = new Scanner(System.in);

		boolean won = false;
		int player = 1;
		int round = 1;
		int maxRound = dimCol * dimRow;

		while (!won && round < maxRound) {

			// print
			for (int row = dimRow - 1; row >= 0; row--) {
				for (int col = 0; col < dimCol; col++) {
					int[] colArray = field[col];

					int v = colArray[row];

					if (v == 0) {
						System.out.print("_");
					} else if (v == 1) {
						System.out.print("X");
					} else {
						System.out.print("O");
					}

					System.out.print(" ");
				}

				System.out.println();
			}

			// picking
			boolean picked = false;
			int pickedColumn = 0;
			int pickedRow = 0;

			while (!picked) {
				System.out.print("Pick column: ");
				pickedColumn = scanner.nextInt();

				boolean valid = pickedColumn >= 0 && pickedColumn < dimCol;

				if (valid) {
					int count = 0;
					for (int v : field[pickedColumn]) {
						if (v != 0) {
							count++;
						}
					}

					picked = count < dimRow;

					if (picked) {
						field[pickedColumn][count] = player;
						pickedRow = count;
						round++;
					} else {
						System.out.println("Row full");
					}
				} else {
					System.out.println("Row invalid");
				}
			}

			// check winner
			// horizontal
			int countHorizontal = 1;
			{
				// left
				for (int i = pickedColumn - 1; i >= 0 && i < dimCol; i--) {
					int v = field[i][pickedRow];
					if (v == player) {
						countHorizontal++;
					} else {
						break;
					}
				}
				// right
				for (int i = pickedColumn + 1; i >= 0 && i < dimCol; i++) {
					int v = field[i][pickedRow];
					if (v == player) {
						countHorizontal++;
					} else {
						break;
					}
				}
			}

			// vertical
			int countVertical = 1;
			{
				// down
				for (int i = pickedRow - 1; i >= 0 && i < dimRow; i--) {
					int v = field[pickedColumn][i];
					if (v == player) {
						countVertical++;
					} else {
						break;
					}
				}
				// up
				for (int i = pickedRow + 1; i >= 0 && i < dimRow; i++) {
					int v = field[pickedColumn][i];
					if (v == player) {
						countVertical++;
					} else {
						break;
					}
				}
			}

			// diagonal1
			int countDiagonal1 = 1;
			{
				// up
				for (int i = pickedColumn + 1, j = pickedRow + 1; i >= 0 && i < dimCol && j >= 0
						&& j < dimRow; i++, j++) {
					int v = field[i][j];
					if (v == player) {
						countDiagonal1++;
					} else {
						break;
					}
				}

				// down
				for (int i = pickedColumn - 1, j = pickedRow - 1; i >= 0 && i < dimCol && j >= 0
						&& j < dimRow; i--, j--) {
					int v = field[i][j];
					if (v == player) {
						countDiagonal1++;
					} else {
						break;
					}
				}
			}

			// diagonal2
			int countDiagonal2 = 1;
			{
				// up
				for (int i = pickedColumn + 1, j = pickedRow - 1; i >= 0 && i < dimCol && j >= 0
						&& j < dimRow; i++, j--) {
					int v = field[i][j];
					if (v == player) {
						countDiagonal2++;
					} else {
						break;
					}
				}

				// down
				for (int i = pickedColumn - 1, j = pickedRow + 1; i >= 0 && i < dimCol && j >= 0
						&& j < dimRow; i--, j++) {
					int v = field[i][j];
					if (v == player) {
						countDiagonal2++;
					} else {
						break;
					}
				}
			}

			won = countHorizontal >= 4 || countVertical >= 4 || countDiagonal1 >= 4 || countDiagonal2 >= 4;
			System.out.println(countHorizontal);
			System.out.println(countVertical);
			System.out.println(countDiagonal1);
			System.out.println(countDiagonal2);

			if (won) {
				System.out.println("Player " + player + " won");
			} else {
				player = player == 1 ? 2 : 1;
			}
		}

		if (round >= maxRound) {
			System.out.println("Draw");
		}

		// print
		for (int row = dimRow - 1; row >= 0; row--) {
			for (int col = 0; col < dimCol; col++) {
				int[] colArray = field[col];

				int v = colArray[row];

				if (v == 0) {
					System.out.print("_");
				} else if (v == 1) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}

				System.out.print(" ");
			}

			System.out.println();
		}

		scanner.close();
	}

}
