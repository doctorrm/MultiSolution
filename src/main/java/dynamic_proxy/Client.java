package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		RealSubject rSubject = new RealSubject();
		InvocationHandler invocationHandler = new DynamicSubject(rSubject);

		Subject subject = (Subject) Proxy.newProxyInstance(rSubject.getClass().getClassLoader(),
				rSubject.getClass().getInterfaces(), invocationHandler);
		subject.request();
	}
}
