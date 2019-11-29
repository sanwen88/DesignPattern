package singletonPattern.demo2;

import java.io.IOException;

public class RuntimeAPIDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * Runtime是Java API的一个运用单例模式的接口类
		 */
		//打开一个Windows记事本
		Process process = Runtime.getRuntime().exec("notepad.exe");
		
		
	}

}
