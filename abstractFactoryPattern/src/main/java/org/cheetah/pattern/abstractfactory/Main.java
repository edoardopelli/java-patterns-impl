package org.cheetah.pattern.abstractfactory;

public class Main {

	
	public static void main(String[] args) {
		
		
		BmwX5Factory bmw =  new BmwX5Factory();
		SkodaKaroqFactory skoda = new SkodaKaroqFactory();
		
		System.out.println(CarFactory.createCar(bmw));
		System.out.println(CarFactory.createCar(skoda));
		
	}
}
