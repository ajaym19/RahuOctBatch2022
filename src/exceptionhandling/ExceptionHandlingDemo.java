package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {

	/*
	 * Exception: unwanted interruption to the exeuction of code
	 * 
	 * 
	 * try: risky lines of code go here catch: what to do if the exception occurs
	 * finally: what should be done irresepective of the exception happening or not
	 * 
	 * 
	 * Exception Types: 1. Compile time: java is validating the code and prompting
	 * at the compile time itself 2. Run time: no compile time propmt, directlty
	 * error is thrown when we execute the code
	 * 
	 * build something
	 * 1 people - 20 days
	 * 10 people - 2 days
	 * 
	 */

	public static void main(String[] args) {
		String filePath = "./src/filehandling/TestFile1";
		try {
			FileReader reader = new FileReader(filePath); // filenotfound
			System.out.println(reader.read()); // IOexception
			System.out.println(3 / 0);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Unable to read the file");
		} catch (Exception e) {
			System.out.println("AN Exception Occurred");
		} finally {
			System.out.println("CLosing all the connections");
		}

		
		// FileReader reader = new FileReader(filePath);

		int b;
		// System.out.println(a);

		int[] a = new int[3];
		// System.out.println(a[7]);
		// System.out.println(3/0);

		String name = null;
//		System.out.println(name.length());

		// TreeSet
		// Reading excel File

		System.out.println();
		try {
			System.out.println(5 / 0);
			System.out.println(name.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: Cannot divide by zero");
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}

	}
}
