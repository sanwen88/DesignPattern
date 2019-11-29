package factoryPattern.factoryMethod.demo2;

/**@author sanwen88  
 * @date 2019年9月17日 下午2:12:52 
 *
 * @Description: 华为手机充电器厂
 *
 * @version V1.0   
 */
public class HuaWeiPhoneCharge extends AbstractHuaWeiPhone {

	@Override
	public void doSomething() {
		System.out.println("华为手机充电器被生产");
	}

}
