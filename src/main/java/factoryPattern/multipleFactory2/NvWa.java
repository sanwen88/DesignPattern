package factoryPattern.multipleFactory2;

public class NvWa {

	public static void main(String[] args) {
		//创建男性工厂
		HumanFactory factory = new MaleFactory();
		//男性工厂开始生产男性黑人
		Human2 human = factory.createBlackHuman();
		//调用人类的业务逻辑方法
		human.getColor();
		human.talk();
		human.getSex();
		
		System.out.println("==============================");
		
		//创建女性工厂
		factory = new FemaleFactory();
		//女性工厂开始生产女性黑人
		human = factory.createBlackHuman();
		//调用人类的业务逻辑方法
		human.getColor();
		human.talk();
		human.getSex();

	}

}
