package template_method.demo01;

public class HummerH1Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("悍马H1启动...");
	}

	@Override
	public void stop() {
		System.out.println("悍马H1停止...");
	}

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H1引擎在咆哮...");
	}

	@Override
	public void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}

}
