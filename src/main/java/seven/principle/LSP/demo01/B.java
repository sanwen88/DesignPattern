package seven.principle.LSP.demo01;

public class B extends A{
	public int func1(int a, int b) {
		return a + b;//重写了父类A的func1方法，但是逻辑完全相反，实现加法算法
	}
	
	public int func2(int a, int b) {
		return func1(a,b) +9;
	}
}
