package builder.demo05;

/**@author sanwen88  
 * @date 2019年10月8日 上午11:19:45 
 *
 * @Description: 建造者模式关注的是零件类型和装配工艺(顺序)，这是它与工厂方法模式最大不同
 *
 * @version V1.0   
 */
public class Director {
	private Builder builder = new ConcreteBuilder();

	// 构建不同的产品
	public Product constructAProduct() {
		builder.setPart();
		/*
		 * 	设置不同的零件，产生不同的产品
		 */
		return builder.buildProduct();
	}
}
