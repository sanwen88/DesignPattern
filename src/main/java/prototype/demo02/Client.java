package prototype.demo02;

/**@author sanwen88  
 * @date 2019年10月10日 下午9:02:23 
 *
 * @Description: 浅拷贝一个问题，即引用对象拷贝的是引用，拷贝后的对象修改成员变量后，源对象成员变量跟着改变
 * 	这就说明应用类型(final String除外)clone的是引用指针，而不是指向的内容本身。
 * 	参见：《设计模式之禅》P234
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Client.testThing();
		System.out.println("--------------------");
		Client.testThing2();
	}
	
	public static void testThing() throws CloneNotSupportedException {
		Thing t = new Thing();
		t.setValue("zhangsan");
		
		Thing cloneT = t.clone();//调用clone方法并不会执行源类型的构造函数,这是clone需要注意的一点。
		cloneT.setValue("lisi");
		
		System.out.println(t.getValue());//[zhangsan, lisi]
		System.out.println(cloneT.getValue());//[zhangsan, lisi]
	}
	
	public static void testThing2() throws CloneNotSupportedException {
		Thing2 t = new Thing2();
		t.setValue("wangwu");
		
		Thing2 cloneT = t.clone();
		cloneT.setValue("zhaoliu");
		
		System.out.println(t.getValue());
		System.out.println(cloneT.getValue());
	}

}
