package tricky;

public class ConstructorTrick {
	private static int counter = 0;

	/**
	 * If we add any return type to the name of the constructor, Java treats it
	 * as a new method instead of giving any error.
	 */
	void ConstructorTrick() {// This is not a constructor which won't be invoked
							// by   new ConstructorTrick();because of 'void',Java just
							// treats it as a method that has a constructor name.
		counter = 51;
	}

	/**
	 * Java doesn't creates no-argument Default Constructor if any constructor
	 * is defined by the programmer. So if you cuncomment the following code,the
	 * main method will give a Compile time error as it won't find the 
	 * constructor matching BuggyBread2().
	 *  /*
	 *   ConstructorTrick(int x){ 
	 *   		counter = x;
	 * 		}
	 */

	public static void main(String[] args) {
		ConstructorTrick bg = new ConstructorTrick();

		System.out.println(counter);// print:0
	}
}
