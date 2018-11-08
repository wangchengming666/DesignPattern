package example;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] agrs) {
		// 静态代理
		// Subject s = new LianJia();
		// s.buyHouse();

		// 动态代理
		Subject subject = new LianJia();
		Subject dynamicProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] { Subject.class },
				new DynamicProxyHandler(subject));
		dynamicProxy.buyHouse();
	}
}
