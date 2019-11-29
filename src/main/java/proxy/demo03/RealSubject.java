package proxy.demo03;

/**@author sanwen88  
 * @date 2019年10月9日 下午3:42:02 
 *
 * @Description: 目标类(也叫被代理类)
 * 	1.指定自身的代理类是谁
 * 	2.根据是否为代理类来判断是否提供服务
 *
 * @version V1.0   
 */
public class RealSubject implements Subject {
	//指定目标的代理是谁(即指定目标类的代理类是谁)
	public Subject proxy = null;
	
	public Subject getProxy() {
		this.proxy = new Proxy(this);
		return this.proxy;
	}

	@Override
	public void login() {
		if(isProxy()) {
			System.out.println("--------->登陆系统");
		}else {
			System.out.println("######### 请使用指定的代理访问 #########");
		}
	}

	@Override
	public void killBoss() {
		if(isProxy()) {
			System.out.println("---------->杀boss");
		}else {
			System.out.println("######### 请使用指定的代理访问 #########");
		}
	}

	@Override
	public void upgrade() {
		if(isProxy()) {
			System.out.println("---------->升一级");
		}else {
			System.out.println("######### 请使用指定的代理访问 #########");
		}
	}
	
	//校验是否是代理访问
	private boolean isProxy() {
		if(null == this.proxy) {
			return false;
		}else {
			return true;
		}
	}
	

}
