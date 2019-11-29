package prototype.demo01;

import java.util.Random;

/**
 * @author sanwen88
 * @date 2019年9月3日 下午4:23:05
 *
 * @Description: 模拟发送电子账单，采用原型模式实现对象创建-实现方式是通过调用Object.clone()方法。类的对象要想能被clone，该类需要实现Cloneable。
 * 	原型模式是在内存进行二进制流拷贝，效率比new一个对象高的多。	
 * 
 * 	在该案例中clone的是Mail对象，Mail类中都是String类型成员变量，因此属性值都会被完整的被clone一份。
 * 	如果Mail类中成员变量是引用类型而非Java中的基本类型与String类型 (在原型模式中，Java的基本数据类型及String类型都被当做基本类型
 * 	，Object.clone()方法会完整拷贝一份这些值，而非拷贝引用类型的地址值), 那么原型模式的实现不能通过Object.clone()这种浅层拷贝一步完成，
 * 	而是通过Object.clone()拷贝基本数据类型属性，外在结合对引用类型属性clone来完成。或者也可以采用Java的对象序列化方式实现原型模式。
 * 	详见demo02.
 *
 * @version V1.0
 */
public class Client {

	// 发送账单的数量，这个值是从数据库中获得
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		// 把模板定义出来，这个是从数据库中获得
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		while (i< MAX_COUNT) {
			//以下是每封邮件不同的地方
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5)+ "先生(女士)");
			cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			
			//然后发送邮件
			sendMail(cloneMail);
			i++;
		}
	}
	
	public static void sendMail(Mail mail) {
		System.out.println("标题："+mail.getSubject() + "\t收件人："+mail.getReceiver()+"\t....发送成功！");
	}
	
	//获得指定长度的随机字符串
	public static String getRandString(int maxLength) {
		String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i =0; i< maxLength; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}

}
