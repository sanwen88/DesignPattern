package proxy.demo04;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**@author sanwen88  
 * @date 2019年10月9日 下午5:12:19 
 *
 * @Description: 动态代理演示
 * 	AOP就是动态代理的典型实现
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		RealSubject subject = new RealSubject();//或者
		//Subject subject = new RealSubject();
		DynamicProxy handler = new DynamicProxy(subject);
		
		ClassLoader cl = subject.getClass().getClassLoader();
		
		//强制类型转换必须要转换为Subject接口类型，而不能是实现类RealSubject类型。
		//Subject proxy = (Subject) Proxy.newProxyInstance(cl, new Class[]{Subject.class}, handler);//或者
		Subject proxy = (Subject) Proxy.newProxyInstance(
				subject.getClass().getClassLoader(),//或者RealSubject.class.getClassLoader(),
				subject.getClass().getInterfaces(), //或者RealSubject.class.getInterfaces(),
				handler);//或者
		
//		Subject proxy = (Subject) Proxy.newProxyInstance(
//				Subject.class.getClassLoader(),//这样可以
//				Subject.class.getInterfaces(), //这种错误,意指Subject接口的接口,应为目标类实现的所有接口-subject.getClass().getInterfaces()
//				handler);
		/*
		 * 	1.Proxy.newProxyInstance生成的代理对象会根据Subject.class接口对外提供和接口中定义的同样多的方法
		 * 	2.proxy.login方法内部会去调用handler中定义的invoke(Object proxy, Method method, Object[] args)，
		 * 	该方法内部会调用method.invoke(this.obj, args)，this.obj代表的就是上面定义的'subject'对象,也就是说调用的
		 * 	是new RealSubject()里的对应方法
		 */
		proxy.login();
		proxy.killBoss();
		proxy.upgrade();
	}
	
	

}
