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
		System.out.println(s2 == s5);// true
	}

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
	

}
