package org.cheetah.pattern.abstractfactory;

public class SkodaKaroqFactory implements ICarFactory {

	public AbstractCar createCar() {
		return new SkodaKaroq();
	}

}
