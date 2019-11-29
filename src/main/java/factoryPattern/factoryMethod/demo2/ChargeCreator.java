//package factoryPattern.factoryMethod.demo2;
//
///**@author sanwen88  
// * @date 2019年9月17日 下午2:40:59 
// *
// * @Description: 充电器厂
// *
// * @version V1.0   
// */
//@Deprecated
//public class ChargeCreator extends AbstractCreator {
//
//	@Override
//	public AbstractXiaoMiPhone createXiaoMiProduct() {
//		return new XiaoMiPhoneCharge();
//	}
//
//	@Override
//	public <T extends AbstractHuaWeiPhone> T createHuaWeiProduct(Class<T> c) {
//		AbstractHuaWeiPhone huaWeiPhoneCharge = null;
//		try {
//			huaWeiPhoneCharge = (AbstractHuaWeiPhone) Class.forName(c.getName()).newInstance();
//		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		return (T) huaWeiPhoneCharge;
//	}
//
//}
