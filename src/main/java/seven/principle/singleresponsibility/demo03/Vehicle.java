package seven.principle.singleresponsibility.demo03;

public class Vehicle {
	
	public void runRoad(String vehicle) {
		System.out.println(vehicle + "在公路上运行...");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle + "在水面上运行...");
	}

	public void runAir(String vehicle) {
		System.out.println(vehicle + "在太空遨游...");
	}
}
