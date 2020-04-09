package examples;

public class ConsoleLogger implements LoggerInterface {

	@Override
	public void print(String text) {
		System.out.println(text);
	}
}
