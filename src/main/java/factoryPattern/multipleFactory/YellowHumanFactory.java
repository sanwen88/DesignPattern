package factoryPattern.multipleFactory;

import factoryPattern.factoryMethod.demo3.Human;
import factoryPattern.factoryMethod.demo3.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
