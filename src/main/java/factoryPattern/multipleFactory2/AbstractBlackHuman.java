package factoryPattern.multipleFactory2;

public abstract class AbstractBlackHuman implements Human2 {

	@Override
	public void getColor() {
		System.out.println("是黑色");

	}

	@Override
	public void talk() {
		System.out.println("说黑话 ");
	}

}
