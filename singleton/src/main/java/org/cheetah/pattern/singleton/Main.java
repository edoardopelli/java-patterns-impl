package org.cheetah.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		UniqueObject uo = UniqueObject.getInstance();
		UniqueObject uo2 = UniqueObject.getInstance();
		
		System.out.println("uo=uo2? "+(uo==uo2));
		
		System.out.println("Try to instance with reflection...");
		
		Constructor<UniqueObject> c = UniqueObject.class.getDeclaredConstructor();
		c.setAccessible(true);
		UniqueObject uo3 = c.newInstance();
		System.out.println(uo3);
	}

}
