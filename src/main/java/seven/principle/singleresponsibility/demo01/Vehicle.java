package seven.principle.singleresponsibility.demo01;

/**
 * 
 * @author sann
 *	交通工具
 */
public class Vehicle {

	/**
	 *  @param vehicle
	 *	run方法违背了单一职责原则，应根据交通工具运行方式不同，拆分成不同类即可。
	 */
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上运行...");
	}
}
