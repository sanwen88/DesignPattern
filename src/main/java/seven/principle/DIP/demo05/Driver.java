package seven.principle.DIP.demo05;

public class Driver implements IDriver {
	
	private ICar car;
	
	public Driver(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void drive() {
		car.run();
	}

}
