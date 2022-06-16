package org.cheetah.pattern.builder;

public class Main {

	public static void main(String[] args) {
		Car b1 = new Car.CarBuilder("Bmw X5",180, 120d).setHasAbs(true).setHasCruiseControl(true).build();
		Car b2 = new Car.CarBuilder("Skoda",130, 90d).setHasAbs(true).setHasCruiseControl(false).build();
		System.out.println(b1);
		System.out.println(b2);
	}

}
