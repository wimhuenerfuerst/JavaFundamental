package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Game {

	PrintField printField;
	Field[][] minefield = new Field[20][20];
	Player player;

	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public Game(PrintField printField) {
		this.printField = printField;
	}

	private void placeMines() {

		int count = 0;

		while (count < 10) {
			int x = random.nextInt(20);
			int y = random.nextInt(20);

			if (minefield[y][x] == null) {
				minefield[y][x] = new Mine();
				count++;
			}
		}
	}

	private void placeGoal() {
		int count = 0;

		while (count < 1) {
			int x = random.nextInt(20);
			int y = random.nextInt(20);

			if (minefield[y][x] == null) {
				minefield[y][x] = new Goal();
				count++;
			}
		}
	}

	private void placeNoMine() {
		for (int i = 0; i < minefield.length; i++) {
			for (int j = 0; j < minefield[i].length; j++) {
				if (minefield[i][j] == null) {
					minefield[i][j] = new NoMine();
				}
			}
		}
	}

	private void placePlayer() {
		int count = 0;

		while (count < 1) {
			int x = random.nextInt(20);
			int y = random.nextInt(20);

			if (minefield[x][y] instanceof NoMine) {
				player = new Player(x, y);
				count++;
			}
		}
	}

	private int clamp(int v, int lower, int upper) {
		v = v < lower ? lower : v;
		v = v > upper ? upper : v;

		return v;
	}

	public void start() {
		placeMines();
		placeGoal();
		placeNoMine();
		placePlayer();

		while (player.isAlive() && !player.hasWon()) {
			printField.print(minefield, player);

			System.out.println("where?");

			String line = scanner.nextLine();

			int x = player.getX();
			int y = player.getY();

			if ("e".equals(line)) {
				x++;
			} else if ("w".equals(line)) {
				x--;
			} else if ("n".equals(line)) {
				y--;
			} else if ("s".equals(line)) {
				y++;
			}

			x = clamp(x, 0, 19);
			y = clamp(y, 0, 19);

			player.setX(x);
			player.setY(y);

			Field field = minefield[y][x];
			field.check(player);
		}

		if (player.hasWon()) {
			System.out.println("you won the game");
		} else {
			System.out.println("you lost the game");
		}

	}

	public static void main(String[] args) {
		Game game = new Game(new ConsolePrintField());
		//Game game = new Game(new AsciiPrintField());
		game.start();
	}

}
