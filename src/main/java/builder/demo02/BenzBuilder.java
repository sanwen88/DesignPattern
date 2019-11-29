package builder.demo02;

import java.util.ArrayList;

import builder.demo01.BenzModel;
import builder.demo01.CarModel;

/**@author sanwen88  
 * @date 2019年9月30日 上午8:16:34 
 *
 * @Description: 具体建造者创建产品
 *
 * @version V1.0   
 */
public class BenzBuilder extends CarBuilder{
	
	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(ArrayList<String> seq) {
		//BenzBuilder通过重写CarBuilder中定义的setSequence()方法，在这个方法内部，去实现真正业务逻辑上的
		//子类BenzModel重写CarModel的setSequence方法。这有点跟正常的，在子类内部重写父类方法有点区别，区别在于
		//通过在第三者子类(BenzBuilder)中调用业务子类，重写的是业务子类继承的父类中方法，从而完成业务子类对父类的重写。
		this.benz.setSequence(seq);
	}

	@Override
	public CarModel getModel() {
		return this.benz;
	}
	
	

}
