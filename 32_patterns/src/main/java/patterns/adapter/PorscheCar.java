package patterns.adapter;

public class PorscheCar implements NewCar {

	@Override
	public void start() {
		System.out.println("start");
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
