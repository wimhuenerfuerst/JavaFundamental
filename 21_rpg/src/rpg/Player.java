package rpg;

public class Player {
	int health = 100;
	int gold;

	public int getHealth() {
		return health;
	}

	public int getGold() {
		return gold;
	}

	public boolean isAlive() {
		return health > 0;
	}

	public void addGold(int gold) {
		this.gold += gold;
	}

	public void addHealth(int health) {
		this.health += health;
	}

	@Override
	public String toString() {
		return "Player [health=" + health + ", gold=" + gold + "]";
	}
}
