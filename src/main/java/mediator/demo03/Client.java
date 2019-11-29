package mediator.demo03;

public class Client {
	

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		mediator.purchase.buyComputer(100);
		
		System.out.println("------------又销售了20台--------------------");
		mediator.sale.sellComputer(20);
		
		System.out.println("------------开始清仓处理------------------");
		mediator.stock.clearStock();
	}

}
