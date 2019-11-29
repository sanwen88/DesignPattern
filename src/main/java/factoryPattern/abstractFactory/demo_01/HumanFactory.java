package factoryPattern.abstractFactory.demo_01;

public interface HumanFactory {
	// 制造一个黄色人种
	public Human createYellowHuman();

	// 制造一个白色人种
	public Human createWhiteHuman();

	// 制造一个黑色人种
	public Human createBlackHuman();
}
