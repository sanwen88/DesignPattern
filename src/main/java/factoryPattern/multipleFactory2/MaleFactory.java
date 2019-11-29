package factoryPattern.multipleFactory2;

public class MaleFactory implements HumanFactory {

	@Override
	public Human2 createBlackHuman() {
		return new MaleBlackHuman();
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
