package test;

public class OverloadTrick {
	/**
	 * key inside constructor is a local variable. 
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		MyClass mc = new MyClass();
		System.out.println(mc.hashCode());
	}
}

class MyClass {
	int key = -1;

	MyClass() {
		int key = 0;
	}

	public int getNext() {
	
		return key;
	}
}