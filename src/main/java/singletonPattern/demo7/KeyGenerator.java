package singletonPattern.demo7;

import java.util.HashMap;

public class KeyGenerator {
	
	private static KeyGenerator keyGen = new KeyGenerator();
	private static final int POOL_SIZE=20;
	private HashMap<String, KeyInfo> keyList = new HashMap<String, KeyInfo>();
	
	private KeyGenerator(){
		//私有构造器，外界无法直接实例化
	}
	
	/**
	 * 	静态工厂方法，提供自己的实例
	 */
	public static KeyGenerator getInstance(){
		return keyGen;
	}
	
	/**
	 * 	提供下一个合适的键值
	 */
	public synchronized int getNextKey(String keyName){
		KeyInfo keyInfo;
		if(keyList.containsKey(keyName)){
			keyInfo = keyList.get(keyName);
			System.out.println("已存在的key");
		}else{
			keyInfo = new KeyInfo(keyName, POOL_SIZE);
			keyList.put(keyName, keyInfo);
			System.out.println("不存在的key，新创建一个key，并保存到单例模式的聚集中");
		}
		return keyInfo.getNextKey();
	}
	

}
