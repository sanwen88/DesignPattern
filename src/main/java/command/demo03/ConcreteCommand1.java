package command.demo03;

public class ConcreteCommand1 extends Command {
	//接收具体的Receiver
	private Receiver receiver;
	
	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}
	

	//具体的命令执行
	@Override
	public void execute() {
		//业务处理
		receiver.doSomething();
	}

}
