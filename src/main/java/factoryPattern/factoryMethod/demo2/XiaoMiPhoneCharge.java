package factoryPattern.factoryMethod.demo2;

/**@author sanwen88  
 * @date 2019年9月17日 下午2:15:21 
 *
 * @Description: 小米手机充电器厂
 *
 * @version V1.0   
 */
public class XiaoMiPhoneCharge extends AbstractXiaoMiPhone {

	@Override
	public void doSomething() {
		System.out.println("小米手机充电器被生产");
	}

}
