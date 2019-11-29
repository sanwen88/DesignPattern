package seven.principle.singleresponsibility.demo02;

public class Test {
	/**
	 *  @param args
	 *	demo02包中各个Vehicle遵循单一职责原则，但是从demo01演变过来，改动很大，即将类分解，同时修改客户端代码。请看demo03
	 */
	public static void main(String[] args) {
		RoadVehicle rVehicle = new RoadVehicle();
		rVehicle.run("汽车");
		rVehicle.run("摩托车");
		
		AirVehicle aVehicle = new AirVehicle();
		aVehicle.run("飞机");
		
		WaterVehicle wVehicle = new WaterVehicle();
		wVehicle.run("汽艇");
	}
}
