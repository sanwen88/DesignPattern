package adapter.interfaceadapter;

/**
 * @author sanwen88  
 * @date 2019年9月12日 下午3:54:42 
 *
 * @Description: 适配器模式三：接口适配器模式
 *
 * @version V1.0
 */
public class Client {
	
	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				System.out.println("覆盖了AbsAdapter抽象类中m1()方法的默认实现");
			}
		};
		absAdapter.m1();
	}

}
