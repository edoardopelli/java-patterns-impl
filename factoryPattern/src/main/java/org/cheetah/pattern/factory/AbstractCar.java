package org.cheetah.pattern.factory;

public abstract class AbstractCar {

	
	public abstract int maxSpeed();
	
	public abstract double maxGas();

	@Override
	public String toString() {
		return getClass().getSimpleName()+" [maxSpeed()=" + maxSpeed() + ", maxGas()=" + maxGas() + "]";
	}
	
	
}
