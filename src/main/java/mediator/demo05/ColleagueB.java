package mediator.demo05;

public class ColleagueB extends AbstractColleague {

	@Override
	public void changeNumber(int number, AbstractMediator mediator) {
		this.number = number;
		mediator.BaffectA();
	}

}
