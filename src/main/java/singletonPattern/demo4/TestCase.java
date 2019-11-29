package singletonPattern.demo4;

/**
 * 	这个案例演示的是数据库键序列生成器的功能，但是没有数据库的支持，将来系统
 * 	重新启动，键序列会冲突。该案例是单例模式
 */
public class TestCase {

	public static void main(String[] args) {
		KeyGenerator kg = KeyGenerator.getInstance();
		
		System.out.println("key1="+kg.getNextKey());
		System.out.println("key2="+kg.getNextKey());
		System.out.println("key3="+kg.getNextKey());

	}

}
