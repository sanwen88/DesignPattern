package factoryPattern.multipleFactory2;

public abstract class AbstractYellowHuman implements Human2 {

	@Override
	public void getColor() {
		System.out.println("是黄色");
	}

	@Override
	public void talk() {
		System.out.println("说黄话");
	}


}
