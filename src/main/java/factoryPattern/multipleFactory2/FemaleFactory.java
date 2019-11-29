package factoryPattern.multipleFactory2;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human2 createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human2 createWhiteHuman() {
		return null;
	}

	@Override
	public Human2 createYellowHuman() {
		return null;
	}

}
