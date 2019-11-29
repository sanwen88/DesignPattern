package mediator.demo05;

public class ColleagueA extends AbstractColleague {

	@Override
	public void changeNumber(int number, AbstractMediator mediator) {
		this.number = number;//给ColleagueA.number赋值
		mediator.AaffectB();//A影响B中number
	}

}
