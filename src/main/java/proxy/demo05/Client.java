package proxy.demo05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.demo04.RealSubject;
import proxy.demo04.Subject;

public class Client {

	public static void main(String[] args) throws Exception {
		Client.test1();
		Client.test2();
	}

	public static void test1() throws Exception {
		// TODO Class<?>中'?'是多个意思?
		Class<?> classProxy = Proxy.getProxyClass(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces());

		Constructor<?> constructor = classProxy.getConstructor(InvocationHandler.class);

		Subject proxy = (Subject) constructor.newInstance(new DynamicProxy(new RealSubject()));

		proxy.login();
	}

	public static void test2() {
		Subject proxy = (Subject)Proxy.newProxyInstance(
				RealSubject.class.getClassLoader(), 
				RealSubject.class.getInterfaces(), 
				new DynamicProxy(new RealSubject()) );
		
		proxy.login();
	}

}
