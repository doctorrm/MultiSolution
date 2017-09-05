package tricky;

class BaseClass {
	public String method() {
		return "Base Class - BaseClass";
	}
}

/**
 * Though Base Class handler is having the object of Derived Class but its not
 * overriding as now with a definition having an argument ,derived class will
 * have both method () and method (int) and hence its overloading.
 * 
 * @Author doctorrm
 * @Time 2017-09-05 ÏÂÎç9:19:35
 */
public class OverloadTrick extends BaseClass {// Now class OverloadTrick has
												// both method() and method(int x)

	private static int counter = 0;

	public String method(int x) {
		return "Derived Class - OverloadTrick";
	}

	public static void main(String[] args) {
		BaseClass bg = new OverloadTrick();
		System.out.println(bg.method());
	}
}