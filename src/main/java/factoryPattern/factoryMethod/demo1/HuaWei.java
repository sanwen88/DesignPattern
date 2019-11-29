package factoryPattern.factoryMethod.demo1;

/**@author sanwen88  
 * @date 2019年9月17日 下午1:02:34 
 *
 * @Description: 具体产品类-华为手机
 *
 * @version V1.0   
 */
public class HuaWei extends AbstractProduct {

	
	/**
	 *	特定的业务逻辑处理
	 */
	@Override
	public void doSomething() {
		System.out.println("生产华为手机业务");
	}

}
