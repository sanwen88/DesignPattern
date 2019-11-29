package seven.principle.ISP.demo02;

/**
 *	A 类通过接口Interface1、Interface2依赖(使用)B类
 */
public class A {
	
	public void depend1(Interface1 i) {
		i.operator1();
	}
	
	public void depend2(Interface2 i) {
		i.operator2();
	}
	
	public void depend3(Interface2 i) {
		i.operator3();
	}

}
