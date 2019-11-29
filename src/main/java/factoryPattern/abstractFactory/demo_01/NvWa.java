package factoryPattern.abstractFactory.demo_01;

public class NvWa {
	
	public static void main(String[] args) {
		//男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
		//女性生产线
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		//生产男性黄色人种/黑色人种/白色人种
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human maleBlackHuman = maleHumanFactory.createBlackHuman();
		Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
		
		//调用业务逻辑
		maleYellowHuman.getColor();
		maleYellowHuman.getSex();
		maleYellowHuman.talk();
		
		maleBlackHuman.getColor();
		maleBlackHuman.getSex();
		maleBlackHuman.talk();
		
		maleWhiteHuman.getColor();
		maleWhiteHuman.getSex();
		maleWhiteHuman.talk();
		
		//生产女性黄色人种
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
	}

}
