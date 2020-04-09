package minesweeper;

import java.util.Arrays;

import de.vandermeer.asciitable.AsciiTable;

public class AsciiPrintField implements PrintField {

	AsciiTable at = new AsciiTable();

	@Override
	public void print(Field[][] minefield, Player player) {
		at.addRule();

		for (int i = 0; i < minefield.length; i++) {

			Field[] row = minefield[i];

			String[] text = new String[row.length];

			for (int j = 0; j < row.length; j++) {
				if (j == player.getX() && i == player.getY()) {
					text[j] = "P";
				} else {
					text[j] = row[j].getToken();
				}
			}

			at.addRow(Arrays.asList(text));

			at.addRule();
		}

		System.out.println(at.render());

	}

}
