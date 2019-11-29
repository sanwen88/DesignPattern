package mediator.demo03;

import java.util.Random;

public class Sale {
	
	private AbstractMediator mediator;
	
	public Sale(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
	/**
	 * 	销售电脑
	 */
	public void sellComputer(int number) {
		this.mediator.execute("sale.sell", number);
	}
	
	/**
	 * 	反馈销售台数(0-100台)，0代表一台都没卖出去，100代表非常畅销
	 */
	public int getSaleStatus() {
		Random rand = new Random();
		int saleStatus = rand.nextInt(100);
		System.out.println("电脑销售了："+saleStatus);
		return saleStatus;
	}
	
	/**
	 * 	折价销售
	 */
	public void offSale() {
		this.mediator.execute("sale.offSale");
	}

}
