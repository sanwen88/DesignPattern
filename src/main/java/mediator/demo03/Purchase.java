package mediator.demo03;

public class Purchase {
	private AbstractMediator mediator;

	public Purchase(AbstractMediator mediator) {
		this.mediator = mediator;
	}

	// 采购电脑
	public void buyComputer(int number) {
		this.mediator.execute("purchase.buy", number);
	}

	// 不采购电脑
	public void refuseBuyComputer() {
		System.out.println("不再采购电脑");
	}
}
