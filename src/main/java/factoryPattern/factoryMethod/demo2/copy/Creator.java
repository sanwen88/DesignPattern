package factoryPattern.factoryMethod.demo2.copy;

/**@author sanwen88  
 * @date 2019年9月17日 下午5:34:06 
 *
 * @Description: 抽象工厂，专门用来生产具体产品,产品自身属性信息和创建产品动作分离，产品对象交由工厂创建
 *
 * @version V1.0   
 */
public abstract class Creator {
	public abstract <T extends AbstractProduct> T create(Class<T> c);
}
