package adapter.interfaceadapter;

//在AbsAdapter 我们将 Interface4 的方法进行默认实现
public abstract class AbsAdapter implements Interface4 {

	@Override
	public void m1() {
		System.out.println("m1() 默认实现");
	}

	@Override
	public void m2() {
		System.out.println("m2() 默认实现");
	}

	@Override
	public void m3() {
		System.out.println("m3() 默认实现");
	}

	@Override
	public void m4() {
		System.out.println("m4() 默认实现");
	}

}
