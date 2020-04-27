package patterns.adapter;

public class MantaCar implements OldCar {

	@Override
	public void warmUp() {
		System.out.println("warmUp");
	}

	@Override
	public void starter() {
		System.out.println("starter");
	}

	@Override
	public void start() {
		System.out.println("start");
	}

	@Override
	public void gear() {
		System.out.println("gear");
	}

	@Override
	public void drive() {
		System.out.println("drive");
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}

}
