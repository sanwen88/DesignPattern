package seven.principle.DIP.demo02;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.receive(new Email());
		
		// 通信方式扩展为微信
		p.receive(new WeChat());
		
		//通信方式可以很容易得扩展成其它得方式
		//...
	}
}
