package builder.demo04;

import java.util.ArrayList;

import builder.demo01.BMWModel;
import builder.demo01.BenzModel;
import builder.demo02.BMWBuilder;
import builder.demo02.BenzBuilder;

/**@author sanwen88  
 * @date 2019年10月7日 下午4:33:21 
 *
 * @Description: 假如没有定义导演类Director，那么客户端就自行定制需要的某类车。 建造者模式，简化的操作演示详见demo05.
 *
 * @version V1.0   
 */
public class Client {
	/*
	 * 有了导演类Director后，就可以这样测试了
	 */
	public static void main(String[] args) {
		Director d = new Director();
		System.out.println("------------生产A型号Benz车------------");
		d.getABenzModel().run();
		System.out.println("------------生产B型号Benz车------------");
		d.getBBenzModel().run();
		System.out.println("---------------生产100台C型号BMW车---------------");
		for(int i=1; i<=100; i++) {
			d.getCBMWModel().run();
			System.out.println("----------第 "+i+" 辆BMW车生产完毕-------------");
		}
	}

	/*
	 * 没有Director类，就需要像下面这个test方法这样，需要自己组装生产顺序。
	 */
	public void test() {
		// 导演就是按照客户要求，指定顺序生产某类汽车，因此可以将导演的动作抽取成一个类即导演类-Director
		ArrayList<String> sequence = new ArrayList<String>(); // 存放run的顺序
		sequence.add("engine boom"); // 客户要求，run的时候时候先发动引擎
		sequence.add("start"); // 启动起来
		sequence.add("stop"); // 开了一段就挺下来

		// 要一个奔驰车：
		BenzBuilder benzBuilder = new BenzBuilder();
		// 把顺序给这个builder类，制造出这样一个车出来
		benzBuilder.setSequence(sequence);
		// 制造出一个奔驰车
		BenzModel benz = (BenzModel) benzBuilder.getModel();
		// 奔驰车跑一下看看
		benz.run();

		// 按照同样的顺序，我再要一个宝马
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel) bmwBuilder.getModel();
		bmw.run();
	}
}
