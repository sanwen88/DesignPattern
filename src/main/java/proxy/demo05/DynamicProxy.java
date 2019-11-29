package proxy.demo05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//代理类
public class DynamicProxy implements InvocationHandler {

	// 目标类实例
	Object obj = null;

	// 我要代理谁
	public DynamicProxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		//如果是登录方法，则发送账号被登陆提示
		if(method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人在用我的账号登陆！");
		}
		return result;
	}

}
