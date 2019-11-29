//package factoryPattern.factoryMethod.demo2;
//
///**@author sanwen88  
// * @date 2019年9月17日 下午2:39:59 
// *
// * @Description: 电池厂
// *
// * @version V1.0   
// */
//@Deprecated
//public class BatteryCreator extends AbstractCreator {
//
//	@Override
//	public AbstractXiaoMiPhone createXiaoMiProduct() {
//		return new XiaoMiPhoneBattery();
//	}
//
//	@Override
//	public <T extends AbstractHuaWeiPhone> T createHuaWeiProduct(Class<T> c) {
//		AbstractHuaWeiPhone huaWeiPhoneBattery = null;
//		try {
//			huaWeiPhoneBattery = (AbstractHuaWeiPhone)Class.forName(c.getName()).newInstance();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}
//		return (T) huaWeiPhoneBattery;
//	}
//
//}
