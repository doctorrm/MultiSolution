package callback;

/**
 * ���ýӿڷ���
 * 
 * @author Doctorwho
 */
public class Li {
	private CallBack callBack;

	public void setCallBack(CallBack callBack) {
		this.callBack = callBack;
	}

	public void executeMessage(String question) {
		System.out.println("what Wang ask is " + question);
		callBack.solve("2");
	}

}
