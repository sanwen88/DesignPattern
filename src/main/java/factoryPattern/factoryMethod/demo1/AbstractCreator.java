package factoryPattern.factoryMethod.demo1;

/**@author sanwen88  
 * @date 2019年9月17日 下午1:03:48 
 *
 * @Description: 抽象创建类，也就是抽象工厂，具体如何创建产品类是由具体的实现工厂 ConcreteCreator完成的
 *
 * @version V1.0   
 */
public abstract class AbstractCreator {
	/*
	 *	这里采用泛型，通过定义泛型对createProduct的输入参数产生两层限制。
	 *	1.必须是Class类型入参
	 *	2.入参必须是AbstractProduct实现类
	 */
	public abstract <T extends AbstractProduct> T createProduct(Class<T> c);
}
