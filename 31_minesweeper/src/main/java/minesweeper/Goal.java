package minesweeper;

public class Goal implements Field {

	@Override
	public void check(Player player) {
		player.won();
	}

	@Override
	public String getToken() {
		return "O";
	}
}
