package patterns.adapter;

public class OldCarAdapter implements NewCar {

	OldCar car;

	public OldCarAdapter(OldCar car) {
		super();
		this.car = car;
	}

	@Override
	public void start() {
		car.warmUp();
		car.starter();
		car.start();
	}

	@Override
	public void drive() {
		car.gear();
		car.drive();
	}

	@Override
	public void stop() {
		car.stop();
	}

}
