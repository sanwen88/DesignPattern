package proxy.demo07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import proxy.demo06.Advice;

/**@author sanwen88  
 * @date 2019年10月12日 下午3:56:52 
 *
 * @Description: 代理类工厂：ProxyFactoryBean类是一个只生产动态代理类的工厂。
 * 	需要提供目标Target对象、Advice对象(封装了系统功能代码)
 *
 * @version V1.0   
 */
public class ProxyFactoryBean {
	private Advice advice;//封装了系统功能的对象
	private Object target;//目标对象
	
	//getter and setter methods
	public Advice getAdvice() {
		return advice;
	}
	public void setAdvice(Advice advice) {
		this.advice = advice;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	
	//返回动态代理类的实例
	public Object getProxy() {
		Object proxy = Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						advice.beforeAdvice(method);
						Object result = method.invoke(target, args);//调用目标方法，并返回调用结果
						advice.afterAdvice(method);
						return result;
					}
				});
		
		return proxy;
	}
}
