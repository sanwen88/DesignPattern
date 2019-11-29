package proxy.demo07;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import proxy.demo06.Advice;

/**@author sanwen88  
 * @date 2019年10月12日 下午4:41:05 
 *
 * @Description: Bean工厂
 *
 * @version V1.0   
 */
public class BeanFactory {
	Properties props = new Properties();
	
	public BeanFactory(InputStream ips) {
		try {
			props.load(ips);//通过IO流加载配置文件的内容
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//返回目标类或代理类的实例
	public Object getBean(String name) {
		String className = props.getProperty(name);
		Object bean = null;
		
		try {
			Class clazz = Class.forName(className);
			bean = clazz.newInstance();//根据Class对象，调用默认构造函数，创建类的实例,如果是非ProxyFactoryBean实例，直接返回该实例
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//ProxyFactoryBean类是一个生产返回动态代理类的工厂类，需要在代理类中添加切面程序逻辑
		if(bean instanceof ProxyFactoryBean) {
			ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
			Object proxy = null;
			try {
				//获取目标类和切面类实例
				Advice advice = (Advice) Class.forName(props.getProperty(name+".advice")).newInstance();
				Object target = (Object) Class.forName(props.getProperty(name+".target")).newInstance();
				
				proxyFactoryBean.setAdvice(advice);
				proxyFactoryBean.setTarget(target);
				
				proxy = proxyFactoryBean.getProxy();
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return proxy;
		}
		
		return bean;
	}
}
