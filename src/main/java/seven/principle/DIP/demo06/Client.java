package seven.principle.DIP.demo06;

/**
 * 
 * @author sanwen88  
 * @date 2019年8月28日 上午11:17:27 
 * @Description: setter方法传递依赖对象演示程序 
 *
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		ICar car = new Benz();
		IDriver zhangsan = new Driver();
		zhangsan.setCar(car);
		zhangsan.drive();
		
	}
	
}
