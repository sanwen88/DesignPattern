package builder.demo04;

import java.util.ArrayList;

import builder.demo01.BenzModel;
import builder.demo01.CarModel;
import builder.demo02.BMWBuilder;
import builder.demo02.BenzBuilder;
import builder.demo02.CarBuilder;


/**@author sanwen88  
 * @date 2019年10月7日 下午4:28:22 
 *
 * @Description: 导演类，导演安排顺序，生产车辆模型
 *
 * @version V1.0   
 */
public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();
	private CarBuilder carBuilder = null;

	// A类型的奔驰车模型，先start,然后stop
	public CarModel getABenzModel() {
		// 清理场景，这里是一些初级程序员不注意的地方
		this.sequence.clear();
		// 这只ABenzModel的执行顺序
		this.sequence.add("start");
		this.sequence.add("stop");
		// 按照顺序返回一个奔驰车
		this.carBuilder = new BenzBuilder();
		this.carBuilder.setSequence(this.sequence);
		return this.carBuilder.getModel();
	}

	// B型号的奔驰车模型，是先发动引擎，然后启动，然后停止
	public CarModel getBBenzModel() {
		this.sequence.clear();

		this.sequence.add("engine");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.carBuilder = new BenzBuilder();
		this.carBuilder.setSequence(this.sequence);
		return this.carBuilder.getModel();
	}

	// C型号的宝马车是先按下喇叭，然后启动，然后停止
	public CarModel getCBMWModel() {
		this.sequence.clear();

		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.carBuilder = new BMWBuilder();
		this.carBuilder.setSequence(this.sequence);
		return this.carBuilder.getModel();
	}

}
