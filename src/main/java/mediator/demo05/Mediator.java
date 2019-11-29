package mediator.demo05;

public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague collA, AbstractColleague collB) {
		super(collA, collB);
	}

	@Override
	protected void AaffectB() {
		int number = this.collA.getNumber();
		this.collB.setNumber(100 * number);
	}

	@Override
	protected void BaffectA() {
		int number = this.collB.getNumber();
		this.collA.setNumber(number/100);
	}

}
