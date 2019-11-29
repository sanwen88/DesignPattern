package prototype.demo05;

import prototype.demo05.Address;
import prototype.demo05.Person;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person("ZS", 17, new Address("安徽", "锦绣大道"));
		Person clonePerson = (Person) person.clone();
		
		System.out.println(person);
        System.out.println(clonePerson);
        
        System.out.println(person.display());
        System.out.println(clonePerson.display());
        
        clonePerson.setName("LS");
        clonePerson.setAge(18);
        Address addr = clonePerson.getAddress();
        addr.setProvince("浙江");
        addr.setStreet("解放路");
        
        System.out.println(clonePerson.display());
        System.out.println(person.display());

	}

}
