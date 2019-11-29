package factoryPattern.simpleFactory;

import factoryPattern.factoryMethod.demo3.Human;
import factoryPattern.factoryMethod.demo3.WhiteHuman;
import factoryPattern.factoryMethod.demo3.YellowHuman;

/**@author sanwen88  
 * @date 2019年9月17日 下午7:26:51 
 *
 * @Description: 工厂方法模式扩展：简单工厂模式
 * 	因项目中某个模块只有一个工厂，就没有必要去创建工厂，而是通过静态工厂方法直接得到具体要生产的产品即可
 *
 * @version V1.0   
 */
public class NvWa {
	
	public static void main(String[] args) {
		//女娲造白人
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		//女娲造黄人
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
