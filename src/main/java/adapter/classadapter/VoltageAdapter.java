package adapter.classadapter;

/**
 * @author sanwen88  
 * @date 2019年9月12日 下午3:30:48 
 *
 * @Description: 适配器类。适配器拿到被适配的类(继承Voltage220V)，然后通过适配接口(实现IVoltage5V)转换输出5V电压，供Phone充电。
 *
 * @version V1.0
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		//获取到220V电压
		int srcV = output220V();
		//转成 5v
		int dstV = srcV / 44;
		return dstV;
	}

}
