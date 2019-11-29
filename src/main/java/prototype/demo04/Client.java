package prototype.demo04;

/**@author sanwen88  
 * @date 2019年10月13日 下午4:03:24 
 *
 * @Description: 看一个更具体的浅层拷贝问题，上一个demo03有点浑人
 *
 * @version V1.0   
 */
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
        System.out.println(person.display());//你会发现clonePerson地址信息改变了，同时person地址信息跟着也改变了，这就是浅拷贝
	}
}
