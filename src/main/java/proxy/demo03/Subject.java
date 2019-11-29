package proxy.demo03;

/**@author sanwen88  
 * @date 2019年10月9日 下午3:37:48 
 *
 * @Description: 假设这是个游戏代练升级的业务接口,在该类(目标类)中通过返回代理对外提供服务，让场景类中对代理类无感知
 *
 * @version V1.0   
 */
public interface Subject {
	
	public abstract void login(); 
	
	public abstract void killBoss();
	
	public abstract void upgrade();
	
	//业务类通过自己的代理对外提供服务
	Subject getProxy();
}
