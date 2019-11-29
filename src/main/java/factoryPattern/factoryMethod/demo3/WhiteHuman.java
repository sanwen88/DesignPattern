package factoryPattern.factoryMethod.demo3;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("是白色");

	}

	@Override
	public void talk() {
		System.out.println("说白话");
	}

}
