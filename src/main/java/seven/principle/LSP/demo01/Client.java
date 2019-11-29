package seven.principle.LSP.demo01;

/**
 * 
 * @author sanwen88  
 * @date 2019年8月28日 下午2:28:35 
 *
 * @Description: 在实际的编程中，我们常常通过重写父类方法，完成新的功能，这样写起来简单，但破坏了整个继承体系。
 *
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println("10-3="+a.func1(10, 3));
		System.out.println("1-10="+a.func1(1, 10));
		
		B b = new B();
		System.out.println("10-3="+b.func1(10, 3));//本意是B继承A，通过B调用A中func1()实现减法逻辑，然而实际却是实现加法算法
		System.out.println("1+10+9="+b.func2(1, 10));
	}
}
