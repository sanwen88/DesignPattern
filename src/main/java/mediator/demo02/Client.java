package mediator.demo02;

/**@author sanwen88  
 * @date 2019年10月14日 上午10:45:21 
 *
 * @Description: 记住这种格式的中介者模式。
 * 	中介者模式实现经销存管理系统:中介者模式和网络拓扑类型的星型网络拓扑结构形似，中介者是星型圆点。
 * 	加入了一个中介者作为三个模块的交流核心，每个模块之间不再相互交流，要交流就通 过中介者进行。每个模块只负责自己的业务逻辑，
 * 	不属于自己的则丢给中介者来处理。
 * 	
 * 	中介者模式，就是将业务规则统一到一个类中，这个类就是中介者。防止各个朋友类之间出现的千丝万缕业务瓜葛关系。
 * 	业务场景类中只增加了个具体的中介者，将中介者通过构造函数传递给各个业务模块。各个业务模块中通过这个中介者去完成业务。
 * 
 * 	模式特点：
 * 	1.
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		
		AbstractMediator mediator = new Mediator();//这里在new Mediator时就产生了Purchase对象
		//采购人员采购电脑
		//Purchase purchase = new Purchase(mediator);//这种方式增加了内存开销，相当于又new Purchase对象，然后通过这个purchase
		//对象里面对Mediator对象的指向，其实还是指向mediator这个对象，对mediator里面的方法进行调用。
		//purchase.buyComputer(100);//并不是进货100台，而是根据临时销售数据判断是否>80。否，折半采购；是，采购本次所需要的数量销售出去
		mediator.purchase.buyComputer(100);//这种方式减少了内存开销，相当于一开始mediator创建好后就是一个闭环
		
		System.out.println("------------又销售了20台--------------------");
		//销售人员销售电脑
		Sale sale = new Sale(mediator);
		sale.sellComputer(20);
		
		System.out.println("------------开始清仓处理------------------");
		//库房管理人员管理库存
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}

}
