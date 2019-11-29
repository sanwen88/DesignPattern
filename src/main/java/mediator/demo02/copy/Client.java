package mediator.demo02.copy;


/**@author sanwen88  
 * @date 2019年10月15日 下午2:57:37 
 *
 * @Description: 我擦，这样设计也行
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
//		Purchase purchase = new Purchase(mediator);
//		Sale sale = new Sale(mediator);
//		Stock stock = new Stock(mediator);
		mediator.purchase.buyComputer(100);
		//这种设计的弊端就是必须同时将Mediator内部依赖的所有模块全部同时实例化，否则可能会出现空指针异常
//		mediator.setPurchase(purchase);
//		mediator.setSale(sale);
//		mediator.setStock(stock);
		
		//采购人员采购电脑
//		purchase.buyComputer(100);
		
		System.out.println("------------又销售了20台--------------------");
		//销售人员销售电脑
		mediator.sale.sellComputer(20);
		
		System.out.println("------------开始清仓处理------------------");
		//库房管理人员管理库存
		mediator.stock.clearStock();
	}

}
