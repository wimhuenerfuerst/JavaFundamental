package patterns.factory.car;

public class VolkswagenCar implements Car {

	@Override
	public void drive() {
		System.out.println("drive umweltfreundlich");
	}

}
