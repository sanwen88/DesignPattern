package factoryPattern.factoryMethod.demo1;

/**@author sanwen88  
 * @date 2019年9月17日 下午1:07:40 
 *
 * @Description: 工厂方法模式通用格式，案例：扩展模式详见demo2
 * 	定义一个用于创建对象的 接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * 	在工厂方法模式中，抽象产品类AbstractProduct负责定义产品的共性，实现对事物最抽象的定 义；
 * 	AbstractCreator为抽象创建类，也就是抽象工厂，具体如何创建产品类是由具体的实现工厂 ConcreteCreator完成的。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		AbstractCreator absCreator = new ConcreteCreator();//创建一具体工厂-手机工厂
		XiaoMi xiaomi = absCreator.createProduct(XiaoMi.class);//工厂生产小米手机
		xiaomi.share();
		xiaomi.doSomething();
		
		HuaWei huawei = absCreator.createProduct(HuaWei.class);//工厂生产华为手机
		huawei.share();
		huawei.doSomething();
	}

}
