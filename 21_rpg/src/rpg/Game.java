package rpg;

import java.util.Scanner;

public class Game {

	Room room;

	public Room buildRoom() {
		int health = (int) ((Math.random() * 100) - 75);
		int gold = (int) (Math.random() * 100);

		Room room = new Room();
		room.init(health, gold);

		return room;
	}

	public Room buildRoomRandom(int depth, int minDepth) {

		Room room = buildRoom();
		double random = Math.random();

		if (depth < minDepth) {
			if (random < 0.5) {
				room.setLeft(buildRoomRandom(depth + 1, minDepth));
				room.setRight(buildRoomRandom(depth + 1, minDepth));
			} else if (random < 0.75) {
				room.setLeft(buildRoomRandom(depth + 1, minDepth));
			} else {
				room.setRight(buildRoomRandom(depth + 1, minDepth));
			}
		} else {
			if (random < 0.1) {
				room.setLeft(buildRoomRandom(depth + 1, minDepth));
				room.setRight(buildRoomRandom(depth + 1, minDepth));
			} else if (random < 0.3) {
				room.setLeft(buildRoomRandom(depth + 1, minDepth));
			} else if (random < 0.5) {
				room.setRight(buildRoomRandom(depth + 1, minDepth));
			}
		}

		return room;
	}

	public void buildRandom() {
		room = new Room();
		room.init(0, 0);

		int depth = 1;
		int minDepth = 3;

		room.setLeft(buildRoomRandom(depth, minDepth));
		room.setRight(buildRoomRandom(depth, minDepth));
	}

	public void buildStatic() {
		room = new Room();
		room.init(0, 0);

		room.setLeft(buildRoom()).setRight(buildRoom()).setLeft(buildRoom()).setLeft(buildRoom());
		room.setRight(buildRoom()).setLeft(buildRoom()).setRight(buildRoom()).setRight(buildRoom());

		room.getLeft().getRight().setRight(buildRoom()).setLeft(buildRoom());
		room.getRight().setRight(buildRoom()).setLeft(buildRoom());
	}

	public void run(Scanner scanner) {
		Player player = new Player();

		while (true) {
			System.out.println("======================================");
			System.out.println(player);

			if (room.hasLeft()) {
				System.out.println("Go left?");
			}

			if (room.hasRight()) {
				System.out.println("Go right?");
			}

			if (!room.hasLeft() && !room.hasRight()) {
				System.out.println("Dead end! Go back you fool!");
			}

			String direction = scanner.nextLine();

			if ("l".equals(direction) && room.hasLeft()) {
				room = room.getLeft();
			} else if ("r".equals(direction) && room.hasRight()) {
				room = room.getRight();
			} else if ("e".equals(direction)) {

				if (room.isEntry()) {
					System.out.println("!!!!!!!!! You survived the maze !!!!!!!!!");
					System.out.println("Health " + player.getHealth());
					System.out.println("Gold " + player.getGold());
					break;
				} else {
					room = room.getExit();
				}
			}

			room.visit(player);

			if (!player.isAlive()) {
				System.out.println("!!!!!!!!! You died !!!!!!!!!");
				System.out.println("Health " + player.getHealth());
				System.out.println("Gold " + player.getGold());
				break;
			}
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Game game = new Game();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the dungeon of death!");
		System.out.println();
		System.out.println("  _____");
		System.out.println(" /     \\");
		System.out.println("| () () |");
		System.out.println(" \\  ^  /");
		System.out.println("  |||||");
		System.out.println("  |||||");
		System.out.println();
		System.out.println("Which maze do you dare to enter?");

		if ("r".equals(scanner.nextLine())) {
			System.out.println("You choose the random maze");
			game.buildRandom();
		} else {
			System.out.println("You choose the static maze");
			game.buildStatic();
		}

		game.run(scanner);

		scanner.close();
	}
}
