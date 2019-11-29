package seven.principle.ISP.demo01;

public class C {
	Interface i = new D();
	
	public void depend1() {
		i.operator1();
	}
	
	public void depend2() {
		i.operator4();
	}

	public void depend3() {
		i.operator5();
	}

}
