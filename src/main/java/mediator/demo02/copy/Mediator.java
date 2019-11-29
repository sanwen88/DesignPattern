package mediator.demo02.copy;

public class Mediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	public Mediator() {
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}
	
	public void execute(String str, Object ...objects) {
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
		if(saleNumber>80) {
			this.stock.increase(saleNumber);
			this.stock.decrease(saleNumber);
		}else {
			int halfNumber = number/2;
			this.stock.increase(halfNumber);
			while(this.stock.getStockNumber()<saleNumber) {
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

	

	

	
	
	
	//getter and setter method
	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	
}
