package prototype.demo05;

//将Address类也实现Cloneable接口，然后重写Object的clone方法
public class Address implements Cloneable{
	
	private String province;
    private String street;
    
    public Address(String province, String street) {
        this.province = province;
        this.street = street;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
    
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
    
	public String toString() {
        return "Address [province=" + province + ", street=" + street + "]";
    }

}
