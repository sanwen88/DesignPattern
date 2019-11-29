package singletonPattern.demo4;

/**
 * 	使用单例模式提供的一个键序列生成器
 */
public class KeyGenerator {
	
	private static KeyGenerator keyGenerator = new KeyGenerator();
	private int key=100;
	
	private KeyGenerator(){}
	
	public static KeyGenerator getInstance(){
		return keyGenerator;
	}
	
	public synchronized int getNextKey(){
		return key++;
	}

}
