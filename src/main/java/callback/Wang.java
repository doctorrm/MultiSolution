package callback;
/**
 * ʵ�ֽӿڷ�����ʹ�ÿ��Ա�����
 * @author Doctorwho
 */
public class Wang implements CallBack {
	private Li li;

	public Wang(Li li) {
		this.li = li;
	}

	public void askQuestion(String question) {
		li.setCallBack(Wang.this);
		li.executeMessage(question);

	}

	@Override
	public void solve(String result) {
		System.out.println("what li tells wang the result is:" + result);
	}

}
