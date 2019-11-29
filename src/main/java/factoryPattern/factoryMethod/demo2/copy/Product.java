package factoryPattern.factoryMethod.demo2.copy;

public class Product extends AbstractProduct {
	private String name;
	private String desc;
	
	@Override
	public void naming(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	public void doSomething() {
		System.out.println(this.name + "被生产");
	}

}
