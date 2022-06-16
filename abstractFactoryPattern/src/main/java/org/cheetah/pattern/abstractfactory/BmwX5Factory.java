package org.cheetah.pattern.abstractfactory;

public class BmwX5Factory implements ICarFactory {

	public AbstractCar createCar() {
		return new BmwX5();
	}

}
