package singletonPattern.demo5;

public class KeyGenerator {
	
	private static KeyGenerator keyGenerator = new KeyGenerator();
	
	
	private KeyGenerator(){}
	
	public static KeyGenerator getInstance(){
		return keyGenerator;
	}
	
	/**
	 * 提供一个合适的主键值
	 */
	public synchronized int getNextKey(){
		return getNextKeyFromDB();
	}

	private int getNextKeyFromDB() {
		String sql_update = "update keyTable set keyValue = keyValue + 1";
		String sql_query = "select keyValue from keyTable";
		//execute update sql
		//run the select query
		//在这里示意性的模拟返回一个值
		return 1000;
	}

}
