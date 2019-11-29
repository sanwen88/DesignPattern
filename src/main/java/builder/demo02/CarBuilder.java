package builder.demo02;

import java.util.ArrayList;

import builder.demo01.CarModel;

/**@author sanwen88  
 * @date 2019年9月30日 上午7:57:06 
 *
 * @Description: 抽象出建造者，具体产品由具体建造者new，抽象建造者提供两个接口：
 * 	1.规范业务流程顺序接口，
 * 	2.返回抽象产品接口，
 *
 * @version V1.0   
 */
public abstract class CarBuilder {
	
	public abstract void setSequence(ArrayList<String> seq);
	
	public abstract CarModel getModel();

}
