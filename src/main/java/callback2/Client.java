package callback2;

public class Client {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setCallBack(new Boss());
		employee.doThing();
	}
}
