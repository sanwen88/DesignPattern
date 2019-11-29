package mediator.demo01.copy;

/**@author sanwen88  
 * @date 2019年10月13日 下午11:49:44 
 *
 * @Description: 准备改写的，结果没完成，希望Purchase、Sale、Stock每个类都依赖其它两个类的。结果变成了
 * 	Purchase、Sale都只对Stock依赖。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("------------销售拿到订单------------------");
		//1.销售带来订单
		int preSaleNumber = Sale.getSaleStatus();
		
		System.out.println("------------采购开始采购电脑---------------");
		//2.采购开始采购电脑
		Purchase purchase = new Purchase();
		purchase.buyComputer(preSaleNumber);
		
		System.out.println("------------销售开始交货------------------");
		//3.销售把电脑销售出去
		Sale sale = new Sale();
		sale.sellComputer(preSaleNumber);
		
		System.out.println("------------年终清仓处理------------------");
		//4.库房管理人员发出清理库存通知
		sale.offSale();

	}

}
