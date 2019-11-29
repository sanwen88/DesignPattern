package mediator.demo02;

/**@author sanwen88  
 * @date 2019年10月14日 上午11:31:01 
 *
 * @Description: 库存管理模块
 * 	1.clearStock()清理库存与其它朋友类发生关系，不依赖与朋友类，改为依赖中介者AbstractMediator类
 *
 * @version V1.0   
 */
public class Stock extends AbstractColleague{
	
	public Stock(AbstractMediator mediator) {
		super(mediator);
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
		System.out.println("待清理存货数量："+COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}
