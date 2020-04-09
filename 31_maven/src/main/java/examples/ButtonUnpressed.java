package examples;

public class ButtonUnpressed implements ButtonInterface {

	@Override
	public ButtonInterface press() {
		System.out.println("you pressed the button");

		return new ButtonPressed();
	}
}
