package minesweeper;

public class Mine implements Field {

	@Override
	public void check(Player player) {
		player.boom();
	}

	@Override
	public String getToken() {
		return "X";
	}

}
