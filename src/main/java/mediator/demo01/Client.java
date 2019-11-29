package mediator.demo01;

/**@author sanwen88  
 * @date 2019年10月13日 下午11:49:44 
 *
 * @Description: 没有使用中介者模式实现的一个经销存管理系统业务逻辑
 * 	Purchase、Sale、Stock三者之间存在着千丝万缕的依赖关系，违背了迪米特法则-每个类只和朋友类交流。
 * 	这个朋友类并非越多越好，朋友类越多，耦合性越大。况且这只是三个模块的情况，现实当中经销存管理除以上三者，还包括：
 * 	物流管理、供应商管理、资产管理等等模块，情况是相当复杂的。下面开始以中介者模式解决该问题-demo02。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		//采购人员采购电脑
		Purchase purchase = new Purchase();
		purchase.buyComputer(100);//开始采购100台
		
		//销售人员销售电脑
		System.out.println("------------又销售了20台--------------------");
		Sale sale = new Sale();
		sale.sellComputer(20);//又销售了20台
		System.out.println("------------开始清仓处理------------------");
		//库房管理人员管理库存
		Stock stock = new Stock();
		stock.clearStock();

	}

}
