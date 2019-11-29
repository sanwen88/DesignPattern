package seven.principle.DIP.demo04;

/** 演示：依赖传递的三种方式，方式一：通过接口方法传递实现依赖。
 *	在业务场景中，我们贯彻“抽象不应该依赖细节”，也就是我们认为抽象（ICar接口）不依赖BMW和Benz两个实现类（细节），
 *	因此我们在高层次的模块中应用都是抽象，Client的实现过程如代码如下：
 *
 *	Client属于高层业务逻辑，它对低层模块的依赖都建立在抽象上，zhangSan的显示类型是IDriver，benz的显示类型是ICar，也许你要问，
 *	在这个高层模块中也调用到了低层模块，比如new Driver()和new Benz()等，如何解释？确实如此，zhangSan的显示类型是IDriver，
 *	是一个接口，是抽象的，非实体化的，在其后的所有操作中，zhangSan都是以IDriver类型进行操作，屏蔽了细节对抽象的影响。
 *	当然，张三如果要开宝马车，也很容易，我们只要修改业务场景类就可以。
 *
 */
public class Client {
	
	/**
	 * @date 2019年8月28日 上午11:40:38
	 * @Description: 通过接口传递，实现依赖 ；Client业务场景需要使用底层组件Car，通过业务类Driver中接口方法
	 * Driver.drive(ICar)来实现依赖的传递。
	 */
	public static void main(String[] args) {
		IDriver zhangsan = new Driver();
		ICar benz = new Benz();
		//张三开奔驰车
		zhangsan.drive(benz);
		
		//张三很容易得就扩展成能开BMW车了
		ICar bmw = new BMW();
		zhangsan.drive(bmw);
	}

}
