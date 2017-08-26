package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
	private Object sub;

	public DynamicSubject() {
	}

	public DynamicSubject(Object sub) {
		this.sub = sub;
	}

	/**
	 * 此方法类似黑箱，会自动调用
	 */
	@Override
	public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
		System.out.println("Before calling " + paramMethod);
		paramMethod.invoke(sub, paramArrayOfObject);// 方法参数sub是实际的被代理对象，args为执
													// 行被代理对象相应操作所需的参数
		System.out.println("After calling " + paramMethod);
		return null;
	}

}
