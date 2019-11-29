package factoryPattern.multipleFactory2;

public abstract class AbstractWhiteHuman implements Human2 {

	@Override
	public void getColor() {
		System.out.println("是白色");

	}

	@Override
	public void talk() {
		System.out.println("说白话");
	}

}
