package factoryPattern.factoryMethod.demo1;

//抽象产品类 AbstractProduct 负责定义产品的共性，实现对事物最抽象的定义。
public abstract class AbstractProduct {
	//产品类的公共方法
	public void share() {
		System.out.println("抽象产品类中定义的是产品的共性操作");
	}
	//抽象方法
	public abstract void doSomething();

}
