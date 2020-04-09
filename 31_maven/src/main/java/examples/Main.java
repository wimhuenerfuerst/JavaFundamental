package examples;

public class Main {

	public static void main(String[] args) {
		ConsoleLogger consoleLogger = new ConsoleLogger();
		FileLogger fileLogger = new FileLogger();

		LoggerUser loggerUser = new LoggerUser(fileLogger);
		loggerUser.doSomething();

		ButtonInterface button = new ButtonUnpressed();
		button = button.press();
		button = button.press();
		button = button.press();

		int pressed = 0;

		if (pressed == 0) {
			System.out.println("already pressed");
			pressed = 1;
		} else if (pressed == 1) {
			System.out.println("you press the button");
			pressed = 2;
		} else {
			System.out.println("the button is now defect");
			pressed = 2;
		}
	}

}
