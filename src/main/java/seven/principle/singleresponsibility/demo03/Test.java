package seven.principle.singleresponsibility.demo03;

public class Test {
	/**
	 *	demo03中Vehicle类违背了单一职责原则，但是Vehicle类中的方法没有，是在方法级别上遵循的单一职责原则 
	 */
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.runRoad("汽车");
		vehicle.runAir("飞机");
		vehicle.runWater("汽艇");
	}
}