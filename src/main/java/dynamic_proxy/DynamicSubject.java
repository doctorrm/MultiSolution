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
	 * �˷������ƺ��䣬���Զ�����
	 */
	@Override
	public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
		System.out.println("Before calling " + paramMethod);
		paramMethod.invoke(sub, paramArrayOfObject);// ��������sub��ʵ�ʵı��������argsΪִ
													// �б����������Ӧ��������Ĳ���
		System.out.println("After calling " + paramMethod);
		return null;
	}

}
