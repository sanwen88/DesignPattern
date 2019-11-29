package singletonPattern.demo8;

import java.util.HashMap;

public class KeyGenerator {
	
	private static final int POOL_SIZE = 20;
	private static HashMap<String, KeyGenerator> keyGens = new HashMap<String, KeyGenerator>();
	private KeyInfo keyInfo;
	
	private KeyGenerator (){
		
	}
	
	private KeyGenerator(String keyName){
		keyInfo = new KeyInfo(keyName, POOL_SIZE);
	}
	
	public static synchronized KeyGenerator getInstance(String keyName){
		KeyGenerator keyGen;
		if(keyGens.containsKey(keyName)){
			System.out.println(keyGens.get("keyName"));
			keyGen = keyGens.get(keyName);
			System.out.println("-------已存在实例--------");
		}else{
			keyGen = new KeyGenerator(keyName);
			keyGens.put(keyName, keyGen);
			System.out.println("-------新建实例--------");
		}
		return keyGen;
	}
	
	public synchronized int getNextKey(){
		return keyInfo.getNextKey();
	}
}
