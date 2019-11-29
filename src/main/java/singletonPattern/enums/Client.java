package singletonPattern.enums;

public class Client {
	
	/**
	 *	使用枚举实现的一个单例模式，枚举中的成员变量就是一个单例的枚举类型常量。
	 *	1) 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。 
	 *	2) 这种方式是Effective Java作者Josh Bloch 提倡的方式 ,项目中推荐使用 
	 *
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.INSTANCE;
		Singleton s2 = Singleton.INSTANCE;
		
		System.out.println(s1 == s2);
		
	}

}
