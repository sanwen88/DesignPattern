package seven.principle.LSP.demo02;

public class Client {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("10-3=" + a.func1(10, 3));
		
		B b = new B();
		System.out.println("10+3="+b.func1(10, 3));//B类的本意是求10+3
		System.out.println("10-3="+b.func3(10, 3));//B类的本意是求10-3，内部通过调用A类方法实现
	}

}
