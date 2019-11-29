package factoryPattern.factoryMethod.demo1;

/**@author sanwen88  
 * @date 2019年9月17日 下午1:04:36 
 *
 * @Description: 具体工厂类
 *
 * @version V1.0   
 */
public class ConcreteCreator extends AbstractCreator {

	@Override
	public <T extends AbstractProduct> T createProduct(Class<T> c) {
		//Object obj = null;
		AbstractProduct absProduct = null;
		try {
			//obj = Class.forName(c.getName()).newInstance();
			absProduct = (AbstractProduct) Class.forName(c.getName()).newInstance();//传入具体产品类,提升到抽象产品类
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		//return (T) obj;
		return (T) absProduct;//返回的是T，对应具体产品类，向下转型成具体产品类。
	}

}
