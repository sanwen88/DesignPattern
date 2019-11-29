package singletonPattern.demo8;

public class KeyInfo {
	
	private String keyName;
	private int keyMin;
	private int keyMax;
	private int poolSize;
	private int nextKey;
	
	public KeyInfo (String keyName, int poolSize){
		this.keyName = keyName;
		this.poolSize = poolSize;
		retriveFromDB();
	}
	
	public int getKeyMax(){
		return keyMax;
	}
	public int getKeyMin(){
		return keyMin;
	}
	
	public int getNextKey(){
		if(nextKey>keyMax){
			retriveFromDB();
		}
		return nextKey++;
	}
	
	private void retriveFromDB() {
		String sql_update = "update keyTable set keyValue=keyValue+"+poolSize+" where keyName='"+keyName+"'";
		String sql_query = "select keyValue from keyTable where keyName='"+keyName+"'";
		//以上两句SQL放在事务中执行，下面给出示例行返回数据1000
		int keyFromDB = 1000;
		keyMax = keyFromDB;
		keyMin = keyMax - poolSize +1;
		nextKey = keyMin;
	}
}
