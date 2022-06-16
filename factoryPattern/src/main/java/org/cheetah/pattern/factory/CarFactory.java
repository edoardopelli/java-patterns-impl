package org.cheetah.pattern.factory;

public class CarFactory {

	public static AbstractCar createCar(CarType carType) {
		AbstractCar car = null;
		switch (carType) {
		case SKODAKAROQ:
			car = new SkodaKaroq();
			break;
		case BMWX5:
			car = new BmwX5();
			break;

		}
		return car;
	}
}
