package mediator.demo04;

public class ColleagueB extends AbstractColleague {

	@Override
	public void changeNumber(int number, AbstractColleague colleague) {
		this.number = number;
		colleague.setNumber(number/100);
	}

}
