package template_method.demo01;

public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("悍马H2启动...");
	}

	@Override
	public void stop() {
		System.out.println("悍马H2停止...");
	}

	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛...");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎在咆哮...");
	}

	@Override
	public void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}

}
