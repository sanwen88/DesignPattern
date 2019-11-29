package seven.principle.DIP.demo01;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		/*
		 *	这里获取的是Email信息，假如将来获取信息的渠道有多种，比如微信、短信，则需要新增类，同时Person也要增加相应的接收方法。
		 *	解决办法：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖。
		 *	因为微信、短信都属于接收的范围，他们各自实现IReceiver接口就ok，这样我们就符合依赖倒转原则，详情看demo02
		 */
		p.receive(new Email());
	}

}
