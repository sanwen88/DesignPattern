package factoryPattern.factoryMethod.demo2;

//抽象手机配件工厂类
public abstract class AbstractCreator {
	//public abstract AbstractXiaoMiPhone createXiaoMiProduct();
	
	//创建小米配件产品
	public abstract <T extends AbstractXiaoMiPhone> T createXiaoMiProduct(Class<T> c);
	//创建华为配件产品
	public abstract <T extends AbstractHuaWeiPhone> T createHuaWeiProduct(Class<T> c);
}
