package singletonPattern.demo5;

import singletonPattern.demo5.KeyGenerator;

/**
 * 该案例是在demo4案例基础上进行的，有数据库的支持，将来系统重启 不会产生键序列冲突，依旧采用的是 单例模式
 * 
 * @author sann
 *
 */
public class TestCase {

	public static void main(String[] args) {
		KeyGenerator kg = KeyGenerator.getInstance();

		System.out.println("key1=" + kg.getNextKey());
		System.out.println("key2=" + kg.getNextKey());
		System.out.println("key3=" + kg.getNextKey());
	}

}
