package proxy.demo01;

public class Proxy implements Subject {
	// 要代理哪个实现类(实现类接口声明)
	private Subject subject = null;

	// 默认被代理者，废弃,会出现死循环
//	public Proxy() {
//		this.subject = new Proxy();
//	}

	// 具体被代理者实现类由此传递
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	//预处理逻辑
	private void before() {
		System.out.println("---->预处理逻辑");
	}

	//善后处理逻辑
	private void after() {
		System.out.println("---->善后处理逻辑");
	}
}
