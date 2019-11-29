package singletonPattern.demo6;

public class KeyGenerator {
	
	private static KeyGenerator keyGen = new KeyGenerator();
	private static final int POOL_SIZE=20;
	private KeyInfo keyInfo;
	
	private KeyGenerator(){
		keyInfo = new KeyInfo(POOL_SIZE);
	}
	
	public static KeyGenerator getInstance(){
		return keyGen;
	}
	
	public synchronized int getNextKey(){
		return keyInfo.getNextKey();
	}
	
}
