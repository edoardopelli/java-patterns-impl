package org.cheetah.pattern.singleton;

public class UniqueObject {

	private UniqueObject() {
		if(UniqueObjectLoader.INSTANCE!=null) {
			throw new UnsupportedOperationException("You can't have two instances of this object!");
		}
	}
	
	private static class UniqueObjectLoader {
		private static UniqueObject INSTANCE = new UniqueObject();
		
		
	}
	
	public static UniqueObject getInstance() {
		return UniqueObjectLoader.INSTANCE;
	}
}
