package singletonPattern.doublecheck;

/**
 * @author sanwen88  
 * @date 2019年9月2日 下午5:08:22 
 *
 * @Description: 工作中常用双重检查的懒加载模式使用单例案例演示。
 *
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		LazySingleton l1 = LazySingleton.getInstance();
		LazySingleton l2 = LazySingleton.getInstance();
		
		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));
	}

}
