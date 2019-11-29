package mediator.demo05;

public abstract class AbstractMediator {
	protected AbstractColleague collA;
	protected AbstractColleague collB;
	
	public AbstractMediator(AbstractColleague collA, AbstractColleague collB) {
		this.collA = collA;
		this.collB = collB;
	}
	
	protected abstract void AaffectB();

	protected abstract void BaffectA();

}
