package prototype.demo03;

import com.alibaba.fastjson.JSON;

public class Client {
	public static void main(String[] args) throws Exception {
		Person p1 = new Person("zs", 18, new Person("ls", 20, null));
		
		Person p2 = (Person) p1.clone();
		System.out.println(JSON.toJSONString(p1));
		
		p2.getFriends().setName("ww");//对象p2中zs的朋友变成ww，不会影响p1对象
		System.out.println(JSON.toJSONString(p1));
		System.out.println(JSON.toJSONString(p2));
		
		System.out.println("--------------------------对象流方式克隆");
		Client client = new Client();
		client.test();
	}
	
	public void test() throws Exception {
		Person person = new Person("zs", 20, new Person("LS", 18, null));
		Person deepPerson = person.deepClone();
		System.out.println(JSON.toJSONString(person));
		System.out.println(JSON.toJSONString(deepPerson));
		
		deepPerson.getFriends().setName("WW");//对象deepPerson中zs的朋友变成WW，不会影响person对象
		System.out.println(JSON.toJSONString(person));
		System.out.println(JSON.toJSONString(deepPerson));
	}

}
