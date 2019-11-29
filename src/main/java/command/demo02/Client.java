package command.demo02;

public class Client {

	public static void main(String[] args) {
		//定义我们的接头人
		Invoker zhangsan = new Invoker();
		
		System.out.println("-----------------客户要求删除一个页面-----------------");
		//客户给我们下命令来
		Command command = new DeletePageCommand();
		//接头人接收到客户需求命令
		zhangsan.setCommand(command);
		//接头人执行命令
		zhangsan.action();
	}

}
