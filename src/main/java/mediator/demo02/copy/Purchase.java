package mediator.demo02.copy;

public class Purchase{
	private Mediator mediator;
	
	public Purchase(Mediator mediator) {
		this.mediator = mediator;
	}

	//采购电脑
	public void buyComputer(int number) {
		this.mediator.execute("purchase.buy", number);
	}

	// 不采购电脑
	public void refuseBuyComputer() {
		System.out.println("不再采购电脑");
	}
}
