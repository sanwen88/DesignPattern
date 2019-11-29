package mediator.demo02.copy;

public class Stock{
	private Mediator mediator;
	
	public Stock(Mediator mediator) {
		this.mediator = mediator;
	}
	
	/**
	 * 	刚开始库存有0台电脑
	 */
	private static int COMPUTER_NUMBER = 0;
	
	/**
	 * 	增加库存
	 */
	public void increase(int number) {
		COMPUTER_NUMBER += number;
		System.out.println("采购后库存数量为: "+COMPUTER_NUMBER);
	}
	
	/**
	 * 	减少库存
	 */
	public void decrease(int number) {
		COMPUTER_NUMBER -= number;
		System.out.println("销售后库存数量为: "+COMPUTER_NUMBER);
	}
	
	/**
	 * 	获取库存数量
	 */
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	/**
	 * 	存货压力大了，就清理库存
	 */
	public void clearStock() {
		this.mediator.execute("stock.clear");
	}
}
