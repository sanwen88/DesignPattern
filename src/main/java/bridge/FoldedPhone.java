package bridge;

//折叠式手机类，继承 抽象类 Phone
public class FoldedPhone extends Phone {

	// 构造器
	public FoldedPhone(Brand brand) {
		super(brand);
	}

	public void open() {
		super.open();//手动去调用XiaoMi、Vivo手机的open()方法
		System.out.println(" 折叠样式手机open ");
	}

	public void close() {
		super.close();
		System.out.println(" 折叠样式手机close ");
	}

	public void call() {
		super.call();
		System.out.println(" 折叠样式手机call ");
	}

}
