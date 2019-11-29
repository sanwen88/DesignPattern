package command.demo03;

/**@author sanwen88  
 * @date 2019年10月18日 下午6:01:38 
 *
 * @Description: 图中数字顺序是业务具体执行流程。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		//1.1、首先声明出调用者Invoker
		Invoker invoker = new Invoker();
		
		//1.3、定义接收者
		Receiver receiver = new ConcreteReciver1();
		
		//1.2、定义一个发送给接收者的命令
		Command command = new ConcreteCommand1(receiver);
		//1、把命令交给调用者
		invoker.setCommand(command);
		//2、调用者执行命令
		invoker.action();
	}

}
