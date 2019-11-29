package seven.principle.DIP.demo05;

/**
 * @author sanwen88  
 * @date 2019年8月28日 上午10:52:40 
 * 
 * @Description: 构造函数传递依赖对象演示程序 
 *
 * @version V1.0
 */
public class Client {
	
	public static void main(String[] args) {
		ICar car = new Benz();
		IDriver zhangsan = new Driver(car);
		zhangsan.drive();
	}
	
}
