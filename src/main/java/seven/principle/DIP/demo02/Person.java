package seven.principle.DIP.demo02;

/**
 *	Person类通过对接口得调用来依赖实现类- Email、WeChat.
 *	这样业务在对Person类操作时，依赖与实际传递给Person类得对象，将来即使扩展了个新得通信方式，只需要实现
 *	IReceiver接口即可，可以很好得融入系统当中。
 */
public class Person {
	
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}

}
