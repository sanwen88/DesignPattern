package seven.principle.ISP.demo02;

/**
 *	C 类通过接口Interface1、Interface3依赖(使用)D类
 */
public class C {
	public void depend1(Interface1 i) {
		i.operator1();
	}
	
	public void depend2(Interface3 i) {
		i.operator4();
	}
	
	public void depend3(Interface3 i) {
		i.operator5();
	}
}
