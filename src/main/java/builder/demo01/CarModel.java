package builder.demo01;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
	
	protected abstract void start();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	protected abstract void stop();
	
	private List<String> sequence = new ArrayList<String>();

	public void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}
	final public void run() {
		for(String seq : sequence) {
			if("start".equalsIgnoreCase(seq)) {
				this.start();
			}else if("alarm".equalsIgnoreCase(seq)) {
				this.alarm();
			}else if("engine".equalsIgnoreCase(seq)) {
				this.engineBoom();
			}else if("stop".equalsIgnoreCase(seq)) {
				this.stop();
			}
		}
	}
}
