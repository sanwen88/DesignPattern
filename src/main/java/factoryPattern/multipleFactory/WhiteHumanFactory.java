package factoryPattern.multipleFactory;

import factoryPattern.factoryMethod.demo3.Human;
import factoryPattern.factoryMethod.demo3.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
