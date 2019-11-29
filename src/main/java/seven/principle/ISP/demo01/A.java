package seven.principle.ISP.demo01;

public class A {
	
	Interface i = new B();
	
	public void depend1() {
		i.operator1();
	}
	
	public void depend2() {
		i.operator2();
	}

	public void depend3() {
		i.operator3();
	}
}
