package template_method.demo02;

/**@author sanwen88  
 * @date 2019年9月26日 上午11:45:43 
 *
 * @Description: 模板方法模式: 行为由父类控制，子类实现。
 * 	定义一个操作中的算法的框架(run()方法实现)，而将一些步骤(start()...stop()等方法实现)延迟到子类中。
 * 	使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		HummerModel h1 = new HummerH1Model();
		h1.run();
		
		HummerModel h2 = new HummerH2Model();
		h2.run();
	}

}
