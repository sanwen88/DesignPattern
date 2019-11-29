package template_method.demo02;

public abstract class HummerModel {
	
	public abstract void start();
	
	public abstract void engineBoom();
	
	public abstract void alarm();
	
	public abstract void stop();

	public final void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}
}
