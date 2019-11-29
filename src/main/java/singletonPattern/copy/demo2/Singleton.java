package singletonPattern.copy.demo2;

public class Singleton {
	
	private Singleton() {
	}
	
	private static class SingleInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingleInstance.INSTANCE;
	}

}
