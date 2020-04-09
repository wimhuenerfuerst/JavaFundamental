package minesweeper;

public class ConsolePrintField implements PrintField {

	@Override
	public void print(Field[][] minefield, Player player) {
		for (int i = 0; i < minefield.length; i++) {
			for (int j = 0; j < minefield[i].length; j++) {

				if (j == player.getX() && i == player.getY()) {
					System.out.print("P|");
				} else {
					Field field = minefield[i][j];
					System.out.print(field.getToken() + "|");
				}
			}
			System.out.println("");
		}

	}

}
