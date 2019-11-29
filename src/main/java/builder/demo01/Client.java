package builder.demo01;

import java.util.ArrayList;
import java.util.List;

/**@author sanwen88  
 * @date 2019年9月26日 下午5:22:16 
 *
 * @Description: 在模板方法模式后，客户又提出新需求，要求生产奔驰、宝马模型，并且启动、鸣笛、停止等操作步骤由客户自己控制顺序。
 * 	也就是说以前由模板方法run()中定义的业务逻辑顺序现在不能由生产商固定，而由客户自己决定。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		List<String> seq = new ArrayList<String>();
		seq.add("start");
		seq.add("engine");
		seq.add("alarm");
		seq.add("stop");
		BMWModel bmw = new BMWModel();
		bmw.setSequence(seq);
		bmw.run();
		
		System.out.println("-----------------------------");
		
		seq.clear();
		seq.add("start");
		seq.add("alarm");
		seq.add("engine");
		seq.add("stop");
		BenzModel bz = new BenzModel();
		bz.setSequence(seq);
		bz.run();
	}

}
