package mediator.demo01;

/**@author sanwen88  
 * @date 2019年10月14日 上午9:34:16 
 *
 * @Description: 采购管理
 * 	1.采购：根据销售情况，销售超过80台以上，开始采购(库存增加)，否则折半采购
 * 	2.不采购：不做任何动作
 *
 * @version V1.0   
 */
public class Purchase {
	
	/**
	 * 	1.采购电脑
	 * 	依赖与Stock、Sale 模块
	 */
	public void buyComputer(int number) {
		//访问库存
		Stock stock = new Stock();
		//访问销售
		Sale sale = new Sale();
		
		int saleNumber = sale.getSaleStatus();
		if(saleNumber>80) {//如果销售了80台以上电脑，表示很畅销，实销多少就采购多少，否则如果这个电脑太畅销，每次采购除销售后还有几台剩余，总有一天库存会满的
			stock.increase(saleNumber);
			stock.decrease(saleNumber);//其实这里设计的出发点是，有销售订单来了，触发采购。如果设计的出发点是销售带着订单过来的
			//,那么场景类中首先应该执行的是Sale.sellComputer(x)，这样这个buyComputer()采购业务就不会掺杂销售业务了，应该更合理些。
		}else { //销售情况不好，折半采购
			int halfNumber = number/2;
			stock.increase(halfNumber);
			while(stock.getStockNumber()<saleNumber) {//折半采购后的库存数量不够本次销售额，需要继续折半采购
				halfNumber = number/2;
				stock.increase(halfNumber);
			}
			stock.decrease(saleNumber);
		}
	}
	
	
	/**
	 * 	2.不采购电脑
	 */
	public void refusedBuyComputer() {
		System.out.println("不再采购电脑");
	}
}
