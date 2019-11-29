package template_method.demo03;

public class HummerH1Model extends HummerModel {

	@Override
	protected void start() {
		System.out.println("悍马H1启动...");
	}

	@Override
	protected void stop() {
		System.out.println("悍马H1停止...");
	}

	@Override
	protected void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("悍马H1引擎在咆哮...");
	}

	//定义一个可控标识操作，用于给客户设置是否喇叭发出声音
	private boolean alarmFlag = true;
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
	
	//重写抽象父类方法，覆盖父类默认喇叭状态,要求H1模型喇叭默认能响
	@Override
	protected boolean isAlarm() {
		return alarmFlag;
	}
}
