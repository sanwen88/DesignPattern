package singletonPattern.demo7;

import singletonPattern.demo7.KeyGenerator;

/**
 * 	在demo6的基础上的一个优化类，单例模式的聚集对象
 * @author sann
 *
 */
public class TestCase {
	
	private static KeyGenerator keyGen;

	public static void main(String[] args) {
		
		keyGen = KeyGenerator.getInstance();
		for(int i=0; i<20; i++){
			System.out.println("key"+(i+1)+" = "+keyGen.getNextKey("PO_NUMBER"));
		}
		keyGen = KeyGenerator.getInstance();
	}

}
