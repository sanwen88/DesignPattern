package command.demo02;

public class Invoker {
	//接收客户命令
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	//执行客户命令
	public void action() {
		this.command.execute();
	}

}
