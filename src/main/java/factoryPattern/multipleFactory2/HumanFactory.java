package factoryPattern.multipleFactory2;

public interface HumanFactory {
	
	public Human2 createBlackHuman();
	public Human2 createWhiteHuman();
	public Human2 createYellowHuman();

}
