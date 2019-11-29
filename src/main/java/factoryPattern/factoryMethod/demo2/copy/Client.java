package factoryPattern.factoryMethod.demo2.copy;

public class Client {
	
	public static void main(String[] args) {
		//创建一具体工厂
		Creator creator = new ConcreteCreator();
		
		//准备创建小米手机品牌电池
		Product product = creator.create(Product.class);
		product.naming("小米手机电池");//设置要创建的产品是小米电池
		product.doSomething();
		
		product.naming("小米手机充电器");
		product.doSomething();
		
		product.naming("华为手机电池");
		product.doSomething();
		
	}

}
