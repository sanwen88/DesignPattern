package proxy.demo07;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**@author sanwen88  
 * @date 2019年10月11日 下午11:47:28 
 *
 * @Description: 模仿AOP框架的一个实现
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		//获取ProxyFactoryBean工厂类实例，通过BeanFactory这个Bean工厂获取
		InputStream ips = Client.class.getResourceAsStream("config.properties");
		BeanFactory factory = new BeanFactory(ips);
		
		//获取代理类
		Object bean = factory.getBean("xxx");
		
		//验证代理类到底是个什么样的东西
		System.out.println(bean.getClass().getName());//com.sun.proxy.$Proxy0
		System.out.println(bean.getClass().getTypeName());//com.sun.proxy.$Proxy0
		System.out.println(bean.getClass().getSuperclass());//class java.lang.reflect.Proxy
		System.out.println(bean instanceof ArrayList);//false,是ArrayList的代理类，实现和ArrayList相同的接口，但不是ArrayList类
		System.out.println(bean instanceof Collection);//true //代理类的确是实现了和目标类相同的接口
		System.out.println(bean instanceof List);//true //代理类的确是实现了和目标类相同的接口
		
		//调用代理类，看看可有切面逻辑添加进来
		Collection c = (Collection)bean;
		c.add("a");//从这里输出可以看出的确有切面逻辑添加进来了
	}

}
