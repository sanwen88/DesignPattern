package factoryPattern.factoryMethod.demo3;

/**@author sanwen88  
 * @date 2019年9月17日 下午7:26:37 
 *
 * @Description: 女娲造人
 *
 * @version V1.0   
 */
public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		Human whiteHuman = factory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		Human blackHuman = factory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
	}

}
