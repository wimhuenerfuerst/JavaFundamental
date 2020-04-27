package patterns.adapter;

public class Driver {
	private NewCar car;

	public Driver(NewCar car) {
		super();
		this.car = car;
	}

	public void drive() {
		car.start();
		car.drive();
		car.stop();
	}

	public static void main(String[] args) {
		Driver driver = new Driver(new PorscheCar());
		driver.drive();
		
		System.out.println("***");

		driver = new Driver(new OldCarAdapter(new MantaCar()));
		driver.drive();
	}
}
