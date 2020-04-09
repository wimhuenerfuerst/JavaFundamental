package minesweeper;

public class Player {
	int lives;

	public Player() {
		this.lives = 3;
	}

	public void boom() {
		System.out.println("You walked on a mine and loose 1 live");
		
		lives--;
	}

	public boolean isAlive() {
		return lives > 0;
	}
}
