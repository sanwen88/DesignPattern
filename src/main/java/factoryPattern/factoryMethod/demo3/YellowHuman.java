package factoryPattern.factoryMethod.demo3;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("是黄色");
	}

	@Override
	public void talk() {
		System.out.println("说黄话");
	}

}
