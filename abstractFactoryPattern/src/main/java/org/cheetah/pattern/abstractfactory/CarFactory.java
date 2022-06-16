package org.cheetah.pattern.abstractfactory;

public class CarFactory {

	public static AbstractCar createCar(ICarFactory carFactory) {
		return carFactory.createCar();
	}
}
