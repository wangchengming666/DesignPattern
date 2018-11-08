package example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理版
 * 
 * @author cm_wang
 *
 */
public class DynamicProxyHandler implements InvocationHandler {

	private Object object;

	public DynamicProxyHandler(final Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("动态代理开始--------->");
		Object result = method.invoke(object, args);
		System.out.println("动态代理结束--------->");
		return result;
	}
}
