package tricky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrickyCodeSnippets {
	public static void main(String[] args) {
			trick1();
	}

/*******************************************************************************/

	public static void trick1() {
		/*
		 * Topic:String Comparison and String Pool. Concepts: .equals() compares
		 * the content of object whereas == checks if it's the same object. When
		 * a string is created and if the string already exists in the pool, the
		 * reference of the existing string will be returned, instead of
		 * creating a new object but returning its reference.
		 */
		String s2 = "I am unique!";
		String s5 = "I am unique!";
		System.out.println(s2 == s5);// true.
		
		/*the following are obviously create different String objects.
		 *  As o1 and o2 are objects, o1==o2  compares the  memory location of 
		 *  o1 & o2 and not the content.  For comparing content, use o1.equals (o2).
		 */
		String o1 = new String("kumar");
		String o2 = new String("kumar");
		if (o1 == o2) {
			System.out.println("TRUE");//false.
		} else {
			System.out.println("FALSE");
		}
	}
	
/*******************************************************************************/
	
	/**
	 * The reason for this is that the Java compiler parses the 
	 * unicode character \u000d as a new line
	 */
	public static void trick2(){
        // \u000d System.out.println("comment executed");
	}
	
	public static void trick3(){
	 loop1: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (i == 3)
						break loop1;
					System.out.println("i = " + i + " j = " + j);
				}
		}
	}
		  /*Output:
		   *i = 0 j = 0
			i = 0 j = 1
			i = 0 j = 2
			i = 0 j = 3
			i = 0 j = 4
			i = 1 j = 0
			i = 1 j = 1
			i = 1 j = 2
			i = 1 j = 3
			i = 1 j = 4
			i = 2 j = 0
			i = 2 j = 1
			i = 2 j = 2
			i = 2 j = 3
			i = 2 j = 4*/

/*******************************************************************************/
	
	/*public static void main(String args[]) {
		int min = 50;
		min(min, 40, 20);
		System.out.println(" Minimum of 20, 40 and 50 is: " + min);// 50 ,no 20!
		// Why? Java passes objects by reference, and all object variables are
		// references. In the above code , it passes by value(int is value,not obejct).
	}

	public static void min(int min, int a, int b) {
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
	}*/
	
/*******************************************************************************/
	
/*	public static void main(String args[]) {
		usingSDF("32/08/2014", "dd/MM/yyyy", "yyyy-MM-dd");
	}

	static void usingSDF(String dt, String inFormat, String outFormat) {
		SimpleDateFormat sdfIn = new SimpleDateFormat(inFormat);
		SimpleDateFormat sdfOut = new SimpleDateFormat(outFormat);

		Date dtTemp = null;
		String output = "";
		try {
			dtTemp = sdfIn.parse(dt);

			output = sdfOut.format(dtTemp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("output : " + output);// output : 2014-09-01 £¬why not 2014-08-32?
		//Reason:SimpleDateFormat parse, automatically changes to next valid date.
	}*/
	
/*******************************************************************************/
/*	
	*//**
	 * key inside constructor is a local variable.
	 * 
	 * @param args
	 *//*
	public static void main(String args[]) {
		MyClass mc = new MyClass();
		System.out.println(mc.getNext());
	}
}

class MyClass {
	int key = -1;

	MyClass() {
		int key = 0;// not invoked! 
	}

	public int getNext() {
		key++;// key=key+1=-1+1=0
		return key;
	}
}*/

/*******************************************************************************/

}