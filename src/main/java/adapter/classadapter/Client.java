package adapter.classadapter;

/**
 * @author sanwen88  
 * @date 2019年9月12日 下午3:13:34 
 *
 * @Description: 适配器模式一：类适配器模式
 *
 * @version V1.0
 */
public class Client {
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
