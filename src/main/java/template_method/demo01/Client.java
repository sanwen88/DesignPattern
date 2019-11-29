package template_method.demo01;

/**
 * @author sanwen88  
 * @date 2019年9月26日 上午11:30:04 
 *
 * @Description: 正常思维实现不同悍马模型的生产
 * 	从这个案例你会发现，两个实现类的run()方法都是完全相同的，那这个run()方法的实现应该出现在抽象类，不应该在实现类上，抽象是所有子类的共性封装
 *
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		//开始生产H1模型
		HummerModel model1 = new HummerH1Model();
		model1.run();
		
		HummerModel model2 = new HummerH2Model();
		model2.run();
	}

}
