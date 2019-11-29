package proxy.demo06;

import java.lang.reflect.Method;

//计算业务接口调用耗时切面程序
public interface Advice {

	void beforeAdvice(Method method);

	void afterAdvice(Method method);
}
