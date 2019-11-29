package seven.principle.ISP.demo02;

/**
 *	类A、C模拟业务类，A通过接口Interface1、Interface2依赖实现类B；
 *	C通过接口Interface1、Interface3依赖实现类D； 
 *
 */
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.depend1(new B());//A类通过接口去依赖B类
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());//C类通过接口去依赖(使用)D类
		c.depend2(new D());
		c.depend3(new D());
	}

}
