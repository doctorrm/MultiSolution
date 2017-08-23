package test;

/**
 * 员工类，必须要记住，这是一个底层类，底层是不了解上层服务的。这里只是调用接口的方法，而具体自己的实现在Boss类中。
 * 
 * @author Doctorwho
 */
public class Employee {
	private CallBackInterface interface1 = null;

	public void setCallBack(CallBackInterface interface1) {
		this.interface1 = interface1;
	}

	public void doThing() {
		for (int i = 0; i < 10; i++) {
			System.out.println("The thing " + i + " has been done !");
		}
		interface1.execute();
	}

}
