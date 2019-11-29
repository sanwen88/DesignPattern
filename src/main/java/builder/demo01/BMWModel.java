package builder.demo01;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("宝马车模型启动...");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马车模型鸣笛...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马车模型引擎在咆哮...");
	}

	@Override
	protected void stop() {
		System.out.println("宝马车模型停止...");
	}

}
