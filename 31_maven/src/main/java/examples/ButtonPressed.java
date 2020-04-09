package examples;

public class ButtonPressed implements ButtonInterface {

	@Override
	public ButtonInterface press() {
		System.out.println("the button is already pressed.");
		return new ButtonDefect();
	}
}
