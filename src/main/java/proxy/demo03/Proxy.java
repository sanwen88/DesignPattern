package proxy.demo03;

/**
 * @author sanwen88
 * @date 2019年10月9日 下午3:39:38
 *
 * @Description: 代理类 ,代理类必须要实现和被代理类同样的接口
 * 	1.如何获取被代理对象 (构造函数传递进来)
 * 	2.
 *
 * @version V1.0
 */
public class Proxy implements Subject {

	//获取被代理对象
	private Subject subject = null;
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void login() {
		this.subject.login();
	}

	@Override
	public void killBoss() {
		this.subject.killBoss();
	}

	@Override
	public void upgrade() {
		this.subject.upgrade();
	}

	/*
	 * 代理角色也可以再次被代理，这个案例中不搞那么复杂，暂时没有演示代理的代理，就返回自己
	 */
	public Subject getProxy() {
		return this;
	}

}
