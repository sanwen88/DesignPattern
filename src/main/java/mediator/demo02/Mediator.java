package mediator.demo02;

/**@author sanwen88  
 * @date 2019年10月14日 上午11:30:23 
 *
 * @Description: 具体中介者
 *
 * @version V1.0   
 */
public class Mediator extends AbstractMediator {

	/**
	 * 	这里的设计不好，应该将buyComputer()、sellComputer()、offSale()、clearStock()全部设计为AbstractMediator中
	 * 	抽象方法，然后Meddiator中具体实现，所有业务模块中调用Mediator中相应buyComputer()、sellComputer()...等方法.
	 */
	@Override
	public void execute(String str, Object... objects) {
		if("purchase.buy".equalsIgnoreCase(str)) {
			this.buyComputer((Integer)objects[0]);
		}else if("sale.sell".equalsIgnoreCase(str)) {
			this.sellComputer((Integer)objects[0]);
		}else if("sale.offSale".equalsIgnoreCase(str)) {
			this.offSale();
		}else if("stock.clear".equalsIgnoreCase(str)) {
			this.clearStock();
		}
	}
	
	//采购电脑
	private void buyComputer(int number) {
		int saleNumber = super.sale.getSaleStatus();
		if(saleNumber>80) {//销售情况良好，销售多少就采购多少
			super.stock.increase(saleNumber);
			super.stock.decrease(saleNumber);
		}else {//销售情况不好，折半采购，然后判断可够销售额的，不够继续折半采购，直到达到销售额，就销售出去
			int halfNumber = number/2;
			super.stock.increase(halfNumber);
			while(super.stock.getStockNumber()<saleNumber) {//折半采购后的库存数量不够本次销售额，需要继续折半采购
				halfNumber = number/2;
				super.stock.increase(halfNumber);
			}
			super.stock.decrease(saleNumber);
		}
	}
	
	//销售电脑
	private void sellComputer(int number) {
		System.out.println("销售电脑："+number+"台");
		if(super.stock.getStockNumber()<number) {//库存不够
			super.purchase.buyComputer(number);
		}else {
			super.stock.decrease(number);
		}
	}
	
	//折价销售电脑
	private void offSale() {
		int saleNumber = super.stock.getStockNumber();
		super.stock.decrease(saleNumber);//折价清空库存
		System.out.println("折价销售电脑："+ saleNumber +"台");
	}
	
	//清仓处理
	private void clearStock() {
		super.sale.offSale();//折价销售所有库存
		super.purchase.refuseBuyComputer();//通知采购不要采购
	}
}
