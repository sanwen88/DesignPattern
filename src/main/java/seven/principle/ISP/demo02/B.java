package seven.principle.ISP.demo02;

public class B implements Interface1, Interface2 {
	@Override
	public void operator1() {
		System.out.println("B 实现了operator1");
	}
	
	@Override
	public void operator2() {
		System.out.println("B 实现了operator2");
	}

	@Override
	public void operator3() {
		System.out.println("B 实现了operator3");
	}
}
