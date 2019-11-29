package mediator.demo02;

/**@author sanwen88  
 * @date 2019年10月14日 上午11:33:04 
 *
 * @Description: 采购管理模块
 * 	1.buyComputer()采购电脑与其它朋友类发生关系，不依赖与朋友类，改为依赖中介者AbstractMediator类
 *
 * @version V1.0   
 */
public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	
	//采购电脑
	public void buyComputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}
	
	//不采购电脑
	public void refuseBuyComputer() {
		System.out.println("不再采购电脑");
	}

}
