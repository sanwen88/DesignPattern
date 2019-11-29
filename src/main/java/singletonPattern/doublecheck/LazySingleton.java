package singletonPattern.doublecheck;

/**
 * 懒汉式双重检查单例类
 */
public class LazySingleton {
	
	/**
	 * volatile让变量每次在使用的时候，都从主存中取。而不是从各个线程的“工作内存”(即寄存器)中去取。
	 */
	private static volatile LazySingleton instance = null;
	/**
     * 	私有构造子，表示该类不可以被继承和外界无法直接实例化
     */
	private LazySingleton(){}
	
	/**
	 * synchronized 是为了解决多线程安全问题,但是效率低，建议采用双重检查方式
	 */
//	public static synchronized LazySingleton getInstance(){
//		if(instance ==null){
//			instance = new LazySingleton();
//		}
//		return instance;
//	}
	
	/**
	 *	双重检查实现单例模式,实际开发中经常采用
	 */
	public static LazySingleton getInstance(){
		if(instance == null) {
			synchronized(LazySingleton.class) {
				if(instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
}
