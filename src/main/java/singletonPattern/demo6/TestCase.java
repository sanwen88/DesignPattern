package singletonPattern.demo6;

/**
 * 	键序列缓存方案,客户端演示
 * @author sann
 *
 */
public class TestCase {
	
	private static KeyGenerator keyGen;
	
	public static void main(String[] args) {
		keyGen = KeyGenerator.getInstance();
		for(int i=0; i<20; i++){
			System.out.println("key"+(i+1)+" = "+keyGen.getNextKey());
		}
	}

}
