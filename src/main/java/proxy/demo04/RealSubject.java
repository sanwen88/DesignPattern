package proxy.demo04;

public class RealSubject implements Subject {

	@Override
	public void login() {
		System.out.println("--------->登陆系统");
	}

	@Override
	public void killBoss() {
		System.out.println("---------->杀boss");
	}

	@Override
	public void upgrade() {
		System.out.println("---------->升一级");
	}

}
