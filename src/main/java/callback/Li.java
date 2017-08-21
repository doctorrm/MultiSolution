package callback;

public class Li {

	public void executeMessage(CallBack callBack , String question) {
		String result="The answer is 2";
		System.out.println("what Wang ask is "+question);	
		
		callBack.solve(result);
	}
	

}
