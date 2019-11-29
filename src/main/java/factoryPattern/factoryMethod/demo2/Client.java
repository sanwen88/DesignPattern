package factoryPattern.factoryMethod.demo2;

/**
 * @author sanwen88
 * @date 2019年9月16日 下午4:51:38
 *
 * @Description: 工厂方法模式扩展案例演示，品牌手机配件产品生产
 *
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {

// 		AbstractHuaWeiPhone p1 = new HuaWeiPhoneBattery();//创建华为手机电池厂
//		p1.doSomething();//生产华为电池
//		AbstractHuaWeiPhone p2 = new HuaWeiPhoneCharge();//创建华为手机充电器厂
//		p2.doSomething();//生产华为充电器

		System.out.println("----->对工厂下达生产小米手机电池订单");
		AbstractCreator creator = new ConcreteCreator();// 创建个手机工厂
		AbstractXiaoMiPhone xiaomi = creator.createXiaoMiProduct(XiaoMiPhoneBattery.class);// 生产小米手机电池
		xiaomi.shareMethod();
		xiaomi.doSomething();
		
		System.out.println("----->对工厂下达生产小米手机充电器订单");
		xiaomi = creator.createXiaoMiProduct(XiaoMiPhoneCharge.class);
		xiaomi.shareMethod();
		xiaomi.doSomething();
		
		
		System.out.println("----->对工厂下达生产华为手机充电器订单");
		AbstractHuaWeiPhone huawei = creator.createHuaWeiProduct(HuaWeiPhoneCharge.class);//生产华为手机充电器
		huawei.shareMethod();
		huawei.doSomething();
		
		System.out.println("----->对工厂下达生产华为手机电池订单");
		huawei = creator.createHuaWeiProduct(HuaWeiPhoneBattery.class);
		huawei.shareMethod();
		huawei.doSomething();
		
		/*
		 *	后面如果要扩展生产手机套，抽象工厂类AbstractCreator无需改动，只需要新增一个品牌手机套，
		 *	手机套继承AbstractHuaWeiPhone抽象类，
		 */
		
	}
}
