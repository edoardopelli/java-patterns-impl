package org.cheetah.pattern.factory;


public class BmwX5 extends AbstractCar {

	@Override
	public int maxSpeed() {
		return 250;
	}

	@Override
	public double maxGas() {
		return 100.5;
	}

}
