package patterns.factory.car;

public class CarFactory {

	private CarFactory() {

	}

	public static Car build(String arg) {

		if ("bmw".equals(arg)) {
			return new BMWCar();
		} else if ("porsche".equals(arg)) {
			return new PorscheCar();
		}

		return new VolkswagenCar();

	}

}
