package proxy.demo02;

/**@author sanwen88  
 * @date 2019年10月9日 上午10:38:30 
 *
 * @Description: 普通代理案例，代理类中new RealSubject()，这个被代理对象，而无需场景类中new
 * 	，好处就是场景类中只需知道代理类存在即可，缺点就是这个代理类只能代理确定的被代理对象。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.request();
	}

}
