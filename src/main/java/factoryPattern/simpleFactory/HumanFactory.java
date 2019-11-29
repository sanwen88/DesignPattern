package factoryPattern.simpleFactory;

import factoryPattern.factoryMethod.demo3.Human;

/**@author sanwen88  
 * @date 2019年9月17日 下午7:20:17 
 *
 * @Description: 简单工厂模式的工厂类。项目该模块只有HumanFactory这一个工厂，因此没必要先把工厂创建出来,
 *	重点是由工厂生产具体产品，得到该产品
 *
 * @version V1.0   
 */
public class HumanFactory {
	
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		
		try {
			
			human = (Human) Class.forName(c.getName()).newInstance();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) human;
	}
	
}
