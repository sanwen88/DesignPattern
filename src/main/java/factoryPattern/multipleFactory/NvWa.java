package factoryPattern.multipleFactory;

import factoryPattern.factoryMethod.demo3.Human;

/**
 * @author sanwen88
 * @date 2019年9月17日 下午7:43:23
 *
 * @Description: 工厂方法模式扩展：多工厂模式 当我们在做一个比较复杂的项目时，经常会遇到初始化一个对象很耗费精力的情况，
 *               所有的产品类都放到一个工厂方法中进行初始化会使代码结构不清晰。例如，一个产品类有5 个具体实现，
 *               每个实现类的初始化（不仅仅是new，初始化包括new一个对象，并对对象设 置一定的初始值）方法都不相同，
 *               如果写在一个工厂方法中，势必会导致该方法巨大无比， 那该怎么办？ 考虑到需要结构清晰，我们就为每个产品定义一个创造者，
 *               然后由调用者自己去选择与 哪个工厂方法关联。
 *
 * @version V1.0
 */
public class NvWa {

	public static void main(String[] args) {
		// 创建一个白色人种工厂
		AbstractHumanFactory humanFactory = new WhiteHumanFactory();
		// 人种工厂生产人种
		Human human = humanFactory.createHuman();
		// 调用人种业务方法
		human.getColor();
		human.talk();

		// 创建一个黑色人种工厂
		humanFactory = new BlackHumanFactory();
		// 人种工厂生产人种
		human = humanFactory.createHuman();
		// 调用人种业务方法
		human.getColor();
		human.talk();

	}
}
