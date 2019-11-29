package proxy.demo01;

/**@author sanwen88  
 * @date 2019年10月9日 上午10:33:14 
 *
 * @Description: 场景类，场景类中还是自己new RealSubject(),这种方式应该交由代理类去做更合适。
 * 	在这个案例中，Proxy类中唯一的好处是，给业务类前后加上了额外的逻辑。普通的代理模式详见demo02.
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Subject proxy = new Proxy(subject);
		proxy.request();
	}

}
