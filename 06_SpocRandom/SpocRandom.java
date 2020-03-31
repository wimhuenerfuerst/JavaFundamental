import java.util.Random;

public class SpocRandom {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(args[r.nextInt(10)]);
	}
}
