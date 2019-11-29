package seven.principle.DIP.demo03;

public class Client {
	/**
	 *	通过这里的业务代码，完成了司机开动奔驰车的场景，到目前为止，这个司机开奔驰车的项目没有任何问题。
	 *	我们在一段貌似磐石的程序上加上一块小石头：张三司机不仅要开奔驰车，还要开宝马车，又该怎么实现呢？
	 *	麻烦出来了，那好，我们走一步是一步，我们先把宝马车产生出来.
	 *	宝马车也产生了，但是我们却没有办法让张三开动起来，为什么？张三没有开动宝马车的方法呀！
	 */
	public static void main(String[] args) {
		Driver zhangsan = new Driver();
		Benz benz = new Benz();
		zhangsan.drive(benz);
		
		BMW bmw = new BMW();
		//zhangsan.drive(BMW);//无此方法，需要扩展Driver类，添加开BMW车的方法，不利于扩展。
	}

}
