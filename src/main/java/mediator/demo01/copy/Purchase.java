package mediator.demo01.copy;

/**
 * @author sanwen88
 * @date 2019年10月14日 上午9:34:16
 *
 * @version V1.0
 */
public class Purchase {

	/**
	 * 1.采购电脑
	 */
	public void buyComputer(int number) {
		System.out.println("需要进行采购电脑：" + number + "台");
		Stock stock = new Stock();
		stock.increase(number);
	}

	/**
	 * 2.不采购电脑
	 */
	public void refusedBuyComputer() {
		System.out.println("不再采购电脑");
	}
}
