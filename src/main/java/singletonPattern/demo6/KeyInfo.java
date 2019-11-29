package singletonPattern.demo6;

public class KeyInfo {
	
	private int keyMin;
	private int keyMax;
	private int nextKey;
	private int poolSize;
	
	public KeyInfo(int poolSize){
		this.poolSize = poolSize;
		retrieveFromDB();
	}
	/**
	 * 	提供键的最大值
	 * @return
	 */
	public int getKeyMax(){
		return keyMax;
	}
	public int getKeyMin(){
		return keyMin;
	}
	/**
	 * 	提供键的当前值
	 * @return
	 */
	public int getNextKey(){
		if(nextKey > keyMax){
			retrieveFromDB();
		}
		return nextKey++;
	}

	/**
	 * 	内部方法，从数据库中提取键的当前值
	 * 	其实这个案例类似与Oracle内部的序列，当重启数据库服务后，即使缓存key值未用完，也不会再被使用
	 */
	private void retrieveFromDB() {
		String sql_update = "update keyTable set keyValue=keyValue+"+poolSize+" where keyName='PO_NUMBER'";
		String sql_query = "select keyValue from keyTable where keyName='PO_NUMBER'";
		//以上两句SQL放在事务中执行，下面给出示例行返回数据1000
		int keyFromDB = 1000;
		keyMax=keyFromDB;
		keyMin=keyMax-poolSize+1;
		nextKey = keyMin;
	}

}
