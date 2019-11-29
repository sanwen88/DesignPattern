package prototype.demo03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author sanwen88
 * @date 2019年9月4日 下午2:14:09
 *
 * @Description: name,age这种类型的成员变量可以直接通过Object.clone()方式直接拷贝，
 *               对于friends这种引用类型，就得采用再度clone这些引用变量方式。
 *               这个案例中假设一个人只有一个朋友，类型也是Person类，其实friends如果定义成ArrayList<Person>也是可以的。
 *
 * @version V1.0
 */
public class Person implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;

	private Person friends;

	public Person(String name, int age, Person friends) {
		super();
		this.name = name;
		this.age = age;
		this.friends = friends;
	}

	/**
	 * 	方式一：
	 * 	通过对成员变量friends的clone方式(深拷贝)，实现原型模式
	 * @throws CloneNotSupportedException 
	 */
	@Override
	protected Person clone(){
		Person person = null;
		try {
			person = (Person)super.clone();
			// 对friends成员变量clone,这是重点
			if(this.friends != null) {
				person.friends = (Person)this.friends.clone();//这才是正确的处理方式，改变clone对象的friends指向
				//this.friends = (Person)this.friends.clone();//这样是说，改变源对象的friends指向
				//this.friends.clone();
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}
	
	/**
	 * 	方式二：当需要创建的对象，引用类型居多，就推荐使用这种方式。
	 * 	通过对Java对象序列化方式，实现原型模式
	 */
	protected Person deepClone() throws CloneNotSupportedException {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		Person person = null;
		try {
			//序列化输出
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			person = (Person)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return person;
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

	public Person getFriends() {
		return friends;
	}

	public void setFriends(Person friends) {
		this.friends = friends;
	}
	
}
