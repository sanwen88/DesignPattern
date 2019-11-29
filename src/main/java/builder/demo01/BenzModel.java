package builder.demo01;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔驰车模型启动...");
	}

	@Override
	protected void alarm() {
		System.out.println("奔驰车模型鸣笛...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰车模型引擎在咆哮...");
	}

	@Override
	protected void stop() {
		System.out.println("奔驰车模型停止...");
	}

}
