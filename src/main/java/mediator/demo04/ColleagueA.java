package mediator.demo04;

public class ColleagueA extends AbstractColleague {

	@Override
	public void changeNumber(int number, AbstractColleague colleague) {
		this.number = number;//给ColleagueA自身number成员变量赋值为number
		colleague.setNumber(100 * number);
	}

}
