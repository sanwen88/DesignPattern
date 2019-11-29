package com.sanwen.flyweight;

/**
 * 
 * @author sanwen
 * 场景测试类
 */

public class Client {
	public static void main(String[] args) {
		//从工厂中获得一个对象
		//SignInfo signInfo = SignInfoFactory.getSignInfo();
		int num=0;
		//初始化对象池
		for(int i=0;i<4;i++){
			String subject = "科目" + i;
			//初始化地址
			for(int j=0;j<30;j++){
				String key = subject + "考试地点"+j;
				SignInfoFactory.getSignInfo(key);
				num++;
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
		System.out.println(num);
	}
}
