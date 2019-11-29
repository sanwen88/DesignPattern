package mediator.demo03;

public class Mediator extends AbstractMediator {
	
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	public Mediator() {
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}

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

	private void buyComputer(Integer number) {
		int saleNumber = this.sale.getSaleStatus();
		if(saleNumber>80) {//销售情况良好，销售多少就采购多少
			this.stock.increase(saleNumber);
			this.stock.decrease(saleNumber);
		}else {//销售情况不好，折半采购，然后判断可够销售额的，不够继续折半采购，直到达到销售额，就销售出去
			int halfNumber = number/2;
			this.stock.increase(halfNumber);
			while(this.stock.getStockNumber()<saleNumber) {//折半采购后的库存数量不够本次销售额，需要继续折半采购
				halfNumber = number/2;
				this.stock.increase(halfNumber);
			}
			this.stock.decrease(saleNumber);
		}		
	}

	private void sellComputer(Integer number) {
		System.out.println("销售电脑："+number+"台");
		if(this.stock.getStockNumber()<number) {//库存不够
			this.purchase.buyComputer(number);
		}else {
			this.stock.decrease(number);
		}		
	}

	private void offSale() {
		int saleNumber = this.stock.getStockNumber();
		this.stock.decrease(saleNumber);//折价清空库存
		System.out.println("折价销售电脑："+ saleNumber +"台");
	}

	private void clearStock() {
		this.sale.offSale();//折价销售所有库存
		this.purchase.refuseBuyComputer();//通知采购不要采购		
	}

}
