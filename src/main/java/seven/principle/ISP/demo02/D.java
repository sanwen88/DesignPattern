package seven.principle.ISP.demo02;

public class D implements Interface1, Interface3 {

	@Override
	public void operator1() {
		System.out.println("D 实现了operator1");
	}

	@Override
	public void operator4() {
		System.out.println("D 实现了operator4");
	}

	@Override
	public void operator5() {
		System.out.println("D 实现了operator5");
	}

}
