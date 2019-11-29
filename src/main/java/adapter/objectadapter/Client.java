package adapter.objectadapter;

/**
 * @author sanwen88  
 * @date 2019年9月12日 下午3:35:39 
 *
 * @Description: 适配器模式二：对象适配器模式
 *
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
