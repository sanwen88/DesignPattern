package mediator.demo01;

/**@author sanwen88  
 * @date 2019年10月14日 上午9:39:52 
 *
 * @Description: 存货管理
 * 	1.采购会增加库存
 * 	2.销售会减少库存
 * 	3.提供库存状态量信息
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
		System.out.println("进行销售，销售后库存数量为: "+COMPUTER_NUMBER);
	}
	
	/**
	 * 	获取库存数量
	 */
	public static int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	/**
	 * 	存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
	 * 	依赖于Purchase、Sale 模块
	 */
	public void clearStock() {
		System.out.println("待清理存货数量："+COMPUTER_NUMBER);
		//访问采购
		Purchase purchase = new Purchase();
		//访问销售
		Sale sale = new Sale();
		//折价销售所有库存
		sale.offSale();
		//通知采购不要采购
		purchase.refusedBuyComputer();
	}

}
