package proxy.demo02;

import proxy.demo01.RealSubject;
import proxy.demo01.Subject;

public class Proxy implements Subject {
	
	private Subject subject = null;
	
	public Proxy() {
		this.subject = new RealSubject();
	}
	
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	// 预处理逻辑
	private void before() {
		System.out.println("---->预处理逻辑");
	}

	// 善后处理逻辑
	private void after() {
		System.out.println("---->善后处理逻辑");
	}

}
