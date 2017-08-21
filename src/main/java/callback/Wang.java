package callback;

public class Wang implements CallBack{
	private Li li;
	
	public Wang(Li li){
		this.li=li;
	}
	
	public void askQuestion(final String question){
		new Thread(new Runnable() {
			
			public void run() {
				li.executeMessage(Wang.this,question);
				
			}
		}).start();
		play();
	}
	
	public void play(){
		System.out.println("I go out for temporary.");
	}
	
	public void solve(String result) {
		System.out.println("what li tells wang the result is:"+result);
	}
	
}
