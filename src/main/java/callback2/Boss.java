package callback2;

/**
 * 老板是作为上层应用身份出现的，下层应用（员工）是不知道 有哪些方法，因此他想被下层应用（员工）调用必须实现此接口。
 * 实现接口的类都是自己写的类。接口相当于框架自身的API，而此类是对其框架方法的扩展，使得框架能调用自己的类。
 * 
 * @author Doctorwho
 */
public class Boss implements CallBackInterface {
	@Override
	public void execute() {
		System.out.println("Boss ad me has got it:" + System.currentTimeMillis());
	}
}
