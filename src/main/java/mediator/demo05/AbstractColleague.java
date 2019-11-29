package mediator.demo05;

public abstract class AbstractColleague {
	protected int number;
	
	//改进后的AbstractColleague关联的是AbstractMediator这个抽象中介者
	public abstract void changeNumber(int number, AbstractMediator mediator);

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
