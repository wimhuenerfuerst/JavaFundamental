package minesweeper;

public interface Field {
	public void check(Player player);

	public String getToken();
}
