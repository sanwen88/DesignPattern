package seven.principle.singleresponsibility.demo01;

public class Test {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");//问题所在
	}
}
