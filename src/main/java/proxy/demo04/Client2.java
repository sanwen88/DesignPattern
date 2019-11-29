package proxy.demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**@author sanwen88  
 * @date 2019年10月10日 上午11:23:24 
 *
 * @Description: 测试不需要生成DynamicProxy这个代理类，将其编程匿名内部类方式
 *
 * @version V1.0   
 */
public class Client2 {

	public static void main(String[] args) throws Exception {
		// TODO getConstructor(InvocationHandler.class)和newInstance(new InvocationHandler())是成对出现的
		// 获取的构造函数入参是InvocationHandler类型，newInstance构造实例对象就得传入InvocationHandler类型入参
		
		//动态生成代理类的Class实例对象，此代理类实现Subject接口。classProxy跟RealSubject一点关系也没有
		Class<?> classProxy = Proxy.getProxyClass(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces()); 
		
		//获得此代理类的构造方法,将InvocationHandler作为入参类型，将来调用InvocationHandler.invoke()方法
		Constructor<?> constructor = classProxy.getConstructor(InvocationHandler.class);
		
		//生成一个代理类对象，InvocationHandler用匿名内部类。invoke方法封装了要执行的目标代码
		Subject proxy = (Subject)constructor.newInstance(new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				return method.invoke(new RealSubject(), args);//这里需要指定具体实例类(目标类)对象
			}
		});
		
		proxy.login();
		proxy.killBoss();
		proxy.upgrade();
	}

}
