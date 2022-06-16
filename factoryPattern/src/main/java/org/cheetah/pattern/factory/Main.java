package org.cheetah.pattern.factory;

public class Main {

	public static void main(String[] args) {
		System.out.println(CarFactory.createCar(CarType.SKODAKAROQ));
		System.out.println(CarFactory.createCar(CarType.BMWX5));
	}

}
