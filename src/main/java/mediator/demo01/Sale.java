package mediator.demo01;

import java.util.Random;

/**@author sanwen88  
 * @date 2019年10月14日 上午9:39:13 
 *
 * @Description: 销售管理
 * 	1.销售电脑,看库存够否，不够，先采购该数量，然后销售出去，库存不变；够了就直接将库存减少
 * 	2.
 *
 * @version V1.0   
 */
public class Sale {
	
	/**
	 * 	销售电脑
	 * 	依赖于Stock、Purchase 模块
	 */
	public void sellComputer(int number) {
		System.out.println("待销售电脑："+number+"台");
		//访问库存
		Stock stock = new Stock();
		//访问采购
		Purchase purchase = new Purchase();
		
		if(stock.getStockNumber()<number) {//不够卖的,通知采购去采购
			purchase.buyComputer(number);
		}else {
			stock.decrease(number);
		}
	}
	
	/**
	 * 	反馈销售台数(0-100台)，0代表一台都没卖出去，100代表非常畅销
	 */
	public int getSaleStatus() {
		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("需要出货电脑："+saleStatus);
		return saleStatus;
	}
	
	/**
	 * 	折价销售
	 */
	public void offSale() {
		Stock stock = new Stock();
		int saleNumber = stock.getStockNumber();
		stock.decrease(saleNumber);//把库存全部折价销售出去
		System.out.println("折价销售电脑："+ saleNumber +"台");
	}

}
