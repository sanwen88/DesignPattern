package factoryPattern.factoryMethod.demo2;

/**@author sanwen88  
 * @date 2019年9月17日 下午2:12:27 
 *
 * @Description: 华为手机电池厂
 *
 * @version V1.0   
 */
public class HuaWeiPhoneBattery extends AbstractHuaWeiPhone {

	@Override
	public void doSomething() {
		System.out.println("华为手机电池被生产");
	}

}
