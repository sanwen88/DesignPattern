package seven.principle.ISP.demo01;

/**
 *	B 和 D类实现了Interface接口的所有方法，这是没有必要的。
 *	A类依赖于B类的operator1、2、3方法，B只需要实现Interface中1、2、3方法即可。
 *	C类依赖于D类的operator1、4、5方法，D只需要实现Interface中1、4、5方法即可。
 *	接口隔离原则案例，相见demo02
 */
public interface Interface {
	
	void operator1();
	void operator2();
	void operator3();
	void operator4();
	void operator5();

}
