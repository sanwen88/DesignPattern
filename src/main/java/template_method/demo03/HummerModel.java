package template_method.demo03;

/**@author sanwen88  
 * @date 2019年9月26日 下午4:23:21 
 *
 * @Description: 模板方法:推荐模板方法(run())是final的，不允许被覆盖。模板方法可以有一个或者几个，它是一个框架，实现对基本方法的调用，
 * 	完成固定的逻辑。
 * 	其它基本方法尽量设计为protected，由子类实现，并且在模板方法中被调用。除非特殊需要，不要在子类中扩大父类的访问权限。
 *
 * @version V1.0   
 */
public abstract class HummerModel {
	
	protected abstract void start();
	
	protected abstract void engineBoom();
	
	protected abstract void alarm();
	
	protected abstract void stop();

	final public void run() {
		this.start();
		this.engineBoom();
		if(this.isAlarm()) {
			this.alarm();
		}
		this.stop();
	}

	//钩子方法，默认喇叭是不会响的，子类可以重写钩子方法，改变默认实现
	protected boolean isAlarm() {
		return true;
	}
}
