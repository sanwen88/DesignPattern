package factoryPattern.factoryMethod.demo2.copy;

public class ConcreteCreator extends Creator {

	@Override
	public <T extends AbstractProduct> T create(Class<T> c) {
		AbstractProduct absProduct = null;
		
		try {
			
			absProduct = (AbstractProduct) Class.forName(c.getName()).newInstance();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return (T) absProduct;
	}

}
