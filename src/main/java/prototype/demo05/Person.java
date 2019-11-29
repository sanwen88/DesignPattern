package prototype.demo05;

//改写chone方法，将Address引用类型属性进行clone
public class Person implements Cloneable {
	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person cp = (Person) super.clone();
		cp.address = (Address) this.address.clone();
		return cp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String display() {
        return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
    }
}
