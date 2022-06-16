package org.cheetah.pattern.builder;

public class Car {
	
	private String type;
	private int maxSpeed;
	private double maxGas;
	
	private boolean hasAbs;
	private boolean hasCruiseControl;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public double getMaxGas() {
		return maxGas;
	}

	public boolean isHasAbs() {
		return hasAbs;
	}
	
	private Car(CarBuilder builder) {
		this.maxSpeed=builder.maxSpeed;
		this.maxGas=builder.maxGas;
		this.hasAbs=builder.hasAbs;
		this.hasCruiseControl=builder.hasCruiseControl;
		this.type=builder.type;
				
	}
	
	public static class CarBuilder {

		public String type;
		private int maxSpeed;
		private double maxGas;
		
		private boolean hasAbs;
		private boolean hasCruiseControl;

		
		public CarBuilder(String type,int maxSpeed, double maxGas) {
			this.maxGas=maxGas;
			this.maxSpeed=maxSpeed;
			this.type= type;
		}


		public CarBuilder setHasAbs(boolean hasAbs) {
			this.hasAbs = hasAbs;
			return this;
		}


		public CarBuilder setHasCruiseControl(boolean hasCruiseControl) {
			this.hasCruiseControl = hasCruiseControl;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}


		
		
		
	}

	public boolean isHasCruiseControl() {
		return hasCruiseControl;
	}

	

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", maxSpeed=" + maxSpeed + ", maxGas=" + maxGas + ", hasAbs=" + hasAbs
				+ ", hasCruiseControl=" + hasCruiseControl + "]";
	}

}
