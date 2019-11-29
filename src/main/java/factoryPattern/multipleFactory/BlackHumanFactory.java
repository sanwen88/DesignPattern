package factoryPattern.multipleFactory;

import factoryPattern.factoryMethod.demo3.BlackHuman;
import factoryPattern.factoryMethod.demo3.Human;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
