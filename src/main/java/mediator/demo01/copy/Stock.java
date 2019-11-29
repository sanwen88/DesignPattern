package mediator.demo01.copy;

/**@author sanwen88  
 * @date 2019年10月14日 上午9:39:52 
 *
 * @Description: 存货管理
 *
 * @version V1.0   
 */
public class Stock {
	/**
	 * 	刚开始存货有0台电脑
	 */
	private static int COMPUTER_NUMBER=0;
	
	/**
	 * 	增加库存
	 */
	public void increase(int number) {
		COMPUTER_NUMBER += number;
		System.out.println("进行采购，采购后库存数量为: "+COMPUTER_NUMBER);
	}
	
	/**
	 * 	减少库存
	 */
	public void decrease(int number) {
		COMPUTER_NUMBER -= number;
		System.out.println("进行出货，出货后库存数量为: "+COMPUTER_NUMBER);
	}
	
	/**
	 * 	获取库存数量
	 */
	public static int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	/**
	 * 	清理库存
	 */
	public void clearStock() {
		int number = Stock.getStockNumber();
		this.decrease(number);
		System.out.println("清理库存电脑："+number+"台");
	}

}
