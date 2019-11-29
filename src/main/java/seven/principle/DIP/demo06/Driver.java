package seven.principle.DIP.demo06;

public class Driver implements IDriver {
	private ICar car;
	
	@Override
	public void setCar(ICar car) {
		this.car = car;
	}

	@Override
	public void drive() {
		car.run();
	}

}
