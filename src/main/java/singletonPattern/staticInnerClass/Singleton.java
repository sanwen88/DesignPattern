package singletonPattern.staticInnerClass;


public class Singleton {
	
	private Singleton() {}
	
	/**
	 *	静态内部类 SingletonInstance 在 Singleton 类被装载时并不会立即实例化，而是在调用Singleton.getInstance()，
	 *	才会装载 SingletonInstance 类，从而完成 SingletonInstance类的实例化，进而完成 Singleton 类的实例化。 以上性质
	 *	保证了延迟加载的特性，效率高，项目中推荐使用该种方式实现单例模式。
	 */
	private static class SingletonInstance{
		/**
		 *	类的静态属性只会在第一次加载类的时候初始化。
		 *	JVM加载类的时候是线程安全的，所以在这里JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
		 *	由此可知， INSTANCE的实例化只会被执行一次，从而保证了单实例特性。
		 */
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}

}
