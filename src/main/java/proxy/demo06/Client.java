package proxy.demo06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("---------下面对ArrayList类进行代理演示---------");
		final ArrayList subject = new ArrayList();//目标类
		Collection collection = (Collection)getProxy(subject, new MyAdvice());
		collection.add("a");
		collection.add("b");
		System.out.println(collection.size());
		
		System.out.println("---------下面对为实现接口的Person类进行代理演示");
		final Person p1 = new Person();
		/* 	Person p = (Person)getProxy(p1, new MyAdvice());会导致如下错误，
		 * 	即使MyInterface p1 = new Person();也是不行的。
		 * 	ClassCastException: com.sun.proxy.$Proxy0 cannot be cast to proxy.demo06.Person
		 */
		//Person p = (Person)getProxy(p1, new MyAdvice());
		MyInterface p = (MyInterface)getProxy(p1, new MyAdvice());
		p.method1();
	}
	
	//根据目标类和切面类，来返回一个代理类
	public static Object getProxy(final Object subject, final Advice advice) {
		//这里返回的是对接口的代理类，而非具体实现接口的实现类的代理类，所以通过getProxy()方法返回的只能强制转换成接口类型，
		//而不能强制转换为实现类，实现类有多个。
		Object proxy = Proxy.newProxyInstance(
				subject.getClass().getClassLoader(), 
				subject.getClass().getInterfaces(), 
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						advice.beforeAdvice(method);
						Object result = method.invoke(subject, args);
//						这里模拟还在执行目标方法
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						advice.afterAdvice(method);
						return result;
					}
				});
		return proxy;
	}

}
