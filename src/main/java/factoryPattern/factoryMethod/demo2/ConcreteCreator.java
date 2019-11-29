package factoryPattern.factoryMethod.demo2;


/**@author sanwen88  
 * @date 2019年9月17日 下午2:58:35 
 *
 * @Description: 具体工厂类，通过反射入参字节码，生成具体产品
 *
 * @version V1.0   
 */
public class ConcreteCreator extends AbstractCreator {

	@Override
	public <T extends AbstractXiaoMiPhone> T createXiaoMiProduct(Class<T> c) {
		AbstractXiaoMiPhone xiaoMiPhone = null;
		
		try {
			xiaoMiPhone = (AbstractXiaoMiPhone) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return (T) xiaoMiPhone;
	}

	@Override
	public <T extends AbstractHuaWeiPhone> T createHuaWeiProduct(Class<T> c) {
		AbstractHuaWeiPhone huaWeiPhone = null;
		
		try {
			huaWeiPhone = (AbstractHuaWeiPhone) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return (T) huaWeiPhone;
	}

}
