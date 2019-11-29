package proxy.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**@author sanwen88  
 * @date 2019年10月9日 下午5:17:59 
 *
 * @Description: 动态代理类
 *
 * @version V1.0   
 */
public class DynamicProxy implements InvocationHandler {
	
	//被代理的实例(目标类实例)
	Object obj = null;
	//我要代理谁(传入目标类)
	public DynamicProxy(Object obj) {
		this.obj = obj;
	}

	/*
	 * 	调用被代理的方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
