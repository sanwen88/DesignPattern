package singletonPattern.demo8;


/**
 * 	这个demo8演示的并不是单例模式，是多例模式
 * @author sann
 *
 */
public class TestCase {
	
	private static KeyGenerator keyGen;

	public static void main(String[] args) {
		
		keyGen = KeyGenerator.getInstance("PO_NUMBER");
		for(int i=0; i<20; i++){
			System.out.println("key"+(i+1)+" = "+keyGen.getNextKey());
		}
		keyGen = KeyGenerator.getInstance("PO_NUMBER");
		
	}

}
