package mediator.demo02;

import java.util.Random;

/**@author sanwen88  
 * @date 2019年10月14日 上午11:30:46 
 *
 * @Description: 销售管理模块
 * 	1.sellComputer()销售电脑与其它朋友类发生关系，不依赖与朋友类，改为依赖中介者AbstractMediator类
 * 	2.offSale()折价销售与其它朋友类发生关系，不依赖与朋友类，改为依赖中介者AbstractMediator类
 * 	3.getSaleStatus()反馈销售数据不与朋友类发生关系，不用改造
 *
 * @version V1.0   
 */
public class Sale extends AbstractColleague{

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}
	
	/**
	 * 	销售电脑
	 */
	public void sellComputer(int number) {
		super.mediator.execute("sale.sell", number);
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
		super.mediator.execute("sale.offSale");
	}

}
