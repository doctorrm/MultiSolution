package test;

/**
 * Ա���࣬����Ҫ��ס������һ���ײ��࣬�ײ��ǲ��˽��ϲ����ġ�����ֻ�ǵ��ýӿڵķ������������Լ���ʵ����Boss���С�
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
