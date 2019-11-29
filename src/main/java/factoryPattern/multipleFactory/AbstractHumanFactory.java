package factoryPattern.multipleFactory;

import factoryPattern.factoryMethod.demo3.Human;

/**@author sanwen88  
 * @date 2019年9月17日 下午7:50:16 
 *
 * @Description: 抽象工厂类
 *	抽象方法中已经不再需要传递相关参数了，因为每一个具体的工厂都已经非常明 确自己的职责：创建自己负责的产品类对象。
 *
 * @version V1.0   
 */
public abstract class AbstractHumanFactory {
	
	public abstract Human createHuman();

}
