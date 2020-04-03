package rpg;

public class Room {

	Room exit;
	Room left;
	Room right;
	int health;
	int gold;

	public void init(int health, int gold) {
		this.health = health;
		this.gold = gold;
	}

	public void visit(Player player) {
		if (gold != 0) {
			System.out.println("You found gold: " + gold);
			player.addGold(gold);
			gold = 0;
		}

		if (health != 0) {
			System.out.println("You gain/loose health: " + health);
			player.addHealth(health);
			health = 0;
		}
	}

	public Room getLeft() {
		return left;
	}

	public Room getRight() {
		return right;
	}

	public Room setLeft(Room left) {
		if (this.left != null) {
			System.out.println("Warning: Left Room overridden");
		}

		this.left = left;
		left.setExit(this);

		return left;
	}

	public Room setRight(Room right) {
		if (this.right != null) {
			System.out.println("Warning: Right Room overridden");
		}

		this.right = right;
		right.setExit(this);

		return right;
	}

	public Room getExit() {
		return exit;
	}

	public void setExit(Room exit) {
		this.exit = exit;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}

	public boolean isEntry() {
		return exit == null;
	}
}
