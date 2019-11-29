package proxy.demo03;

/**@author sanwen88  
 * @date 2019年10月9日 上午10:57:42 
 *
 * @Description: 强制代理模式
 * 	
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		Client.testErrorCallSubject();
		
		Client.testErrorCallProxy();
		
		System.out.println("--------正确的访问方式是这样的:必须通过真实类的代理类来访问--------");
		Client.testSuccessfulCallProxy();
	}
	
	/*
	 * 	直接访问被代理对象是行不通的
	 */
	public static void testErrorCallSubject() {
		Subject subject = new RealSubject();
		subject.login();
		subject.killBoss();
		subject.upgrade();
	}
	
	/*
	 * 	直接通过访问代理对象也是行不通的
	 */
	public static void testErrorCallProxy() {
		Proxy proxy = new Proxy(new RealSubject());
		proxy.login();
		proxy.killBoss();
		proxy.upgrade();
	}
	
	public static void testSuccessfulCallProxy() {
		Subject subject = new RealSubject();
		Subject proxy = subject.getProxy();
		proxy.login();
		proxy.killBoss();
		proxy.upgrade();
	}

}
