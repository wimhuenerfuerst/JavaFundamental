package patterns.factory;

import patterns.factory.car.Car;

public class Driver {

	Car car;

	public Driver(Car car) {
		this.car = car;
	}

	public void useCar() {
		System.out.println("Start driving");
		car.drive();
	}
}
