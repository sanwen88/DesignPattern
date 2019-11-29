package mediator.demo01.copy;

import java.util.Random;

/**@author sanwen88  
 * @date 2019年10月14日 上午9:39:13 
 *
 * @Description: 销售管理
 *
 * @version V1.0   
 */
public class Sale {
	
	/**
	 * 	销售电脑
	 */
	public void sellComputer(int number) {
		System.out.println("准备出货电脑："+number+"台");
		Stock stock = new Stock();
		stock.decrease(number);
	}
	
	/**
	 * 	反馈销售台数(0-100台)，0代表一台都没卖出去
	 */
	public static int getSaleStatus() {
		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("收到订单需要采购电脑："+saleStatus+"台");
		return saleStatus;
	}
	
	/**
	 * 	年底折价清理库存
	 */
	public void offSale() {
		Stock stock = new Stock();
		stock.clearStock();
	}

}
