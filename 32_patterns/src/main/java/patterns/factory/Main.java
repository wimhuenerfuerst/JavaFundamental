package patterns.factory;

import patterns.factory.car.CarFactory;

public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver(CarFactory.build(args[0]));
		driver.useCar();
	}

}
