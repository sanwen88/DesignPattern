package proxy.demo01;

public class RealSubject implements Subject {

	@Override
	//业务逻辑处理
	public void request() {
		System.out.println("----->业务处理");
	}

}
