package tricky;

/**
 * Application: 1>need some operation within init method. 2>using in anonomous
 * inner method which disallow a constructor.
 * 
 * notice:You will need to duplicate every constructor if there are multiple of
 * them. but you just need one init method to achieve same idea.
 * 
 * @Author doctorrm
 * @Time 2017-10-05 上午10:14:56
 */
public class Initializer {

	static {// called first and only once.
		System.out.println("static initializer is called first and only once.");
	}

	{
		System.out.println("instance initializer is called.");
	}

	public Initializer() {// last called.
		System.out.println("constructor is called last.");
	}

	public static void main(String[] args) {

		new Initializer();
		new Initializer();

	}
}
