package factoryPattern.factoryMethod.demo2;

/**
 * @author sanwen88
 * @date 2019年9月17日 下午2:03:48
 *
 * @Description: 抽象产品华为手机
 *
 * @version V1.0
 */
public abstract class AbstractHuaWeiPhone {
	// 每款华为手机共性操作
	public void shareMethod() {
		System.out.println("每款华为手机共有的操作");
	}

	// 每款华为手机共性特征,不同实现
	public abstract void doSomething();
}
