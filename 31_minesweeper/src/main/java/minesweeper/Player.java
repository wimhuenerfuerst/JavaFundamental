package minesweeper;

public class Player {
	int lives;
	boolean won;
	int x;
	int y;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.lives = 3;
		this.won = false;
	}

	public void boom() {
		System.out.println("You walked on a mine and loose 1 live");

		lives--;
	}

	public boolean isAlive() {
		return lives > 0;
	}

	public boolean hasWon() {
		return won;
	}

	public void won() {
		this.won = true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
