package command.demo03;

public class ConcreteReciver1 extends Receiver {

	//每个接受者都必须处理一定的业务逻辑
	@Override
	public void doSomething() {
		System.out.println("-----------具体接收者1 dosomething------------");
	}

}
