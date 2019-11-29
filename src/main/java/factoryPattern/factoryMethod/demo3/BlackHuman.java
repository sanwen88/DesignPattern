package factoryPattern.factoryMethod.demo3;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("是黑色");

	}

	@Override
	public void talk() {
		System.out.println("说黑话 ");
	}

}
