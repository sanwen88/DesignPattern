package seven.principle.LSP.demo02;

/**
 * 
 * @author sanwen88  
 * @date 2019年8月28日 下午2:33:47 
 *
 * @Description: 这里B类没有直接继承A类，但通过组合关系，将A作为成员变量，任然可以使用A类的方法。
 *
 * @version V1.0
 */
public class B extends Base {
	private  A a = new A();
	
	//这里由于B没有继承A类，不会让人误解func1()是用来实现两个数相减的算法逻辑
	public int func1(int a, int b) {
		return a + b;
	}
	
	public int func2(int a, int b) {
		return func1(a, b)+9;
	}
	
	//B类中任然可以通过A类实现两个数相减的业务逻辑
	public int func3(int a, int b) {
		return this.a.func1(a, b);
	}
	
}
