package proxy.demo06;

import java.lang.reflect.Method;

public class MyAdvice implements Advice {
	
	private long beginTime = 0;//起始时间毫秒数 

	@Override
	public void beforeAdvice(Method method) {
		beginTime = System.currentTimeMillis();
	}

	@Override
	public void afterAdvice(Method method) {
		long endTime = System.currentTimeMillis();
		System.out.println(method.getName()+"() 方法执行了 "+ (endTime - beginTime) +" ms");
	}
	
}
