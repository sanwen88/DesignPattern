package factoryPattern.factoryMethod.demo2;

/**
 * @author sanwen88
 * @date 2019年9月17日 下午1:56:40
 *
 * @Description: 抽象产品小米手机
 *
 * @version V1.0
 */
public abstract class AbstractXiaoMiPhone {
	//每款小米手机共性操作
	public void shareMethod() {
		System.out.println("每款小米手机共有的操作");
	}

	// 每款小米手机共性特征,不同实现
	public abstract void doSomething();
}
