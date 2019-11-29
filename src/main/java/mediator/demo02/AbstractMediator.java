package mediator.demo02;

/**@author sanwen88  
 * @date 2019年10月14日 上午11:01:13 
 *
 * @Description: 抽象中介者，真正的中介者是Mediator类,实现对中介者的定义
 *
 * @version V1.0   
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	public AbstractMediator() {
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}
	
	/*
	 * 	中介者最重要的方法，叫做事件方法，处理多个对象之间的关系
	 */
	public abstract void execute(String str, Object ... objects) ;
	
}
