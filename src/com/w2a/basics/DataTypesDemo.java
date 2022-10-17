package com.w2a.basics;

public class DataTypesDemo {

	/*
	 * Java is a case sensitive language
	 * 
	 * Data Type: A variable is used to store data/values It is compulsory in JAVA
	 * to define the data type of variable
	 * 
	 * Data type: it defines what type or kind of data we want to store in the
	 * variable
	 * 
	 * Two Types: 1. Primitive: Integer: byte, short, int, long Decimal: float,
	 * double one character: char yes/no value: boolean
	 * 
	 * 2. Non Primitive: Array, List, Map, String
	 */

	public static void main(String[] args) {
		int id = 1;

		// sugar >> container >> 50KG
		// rice >> container >> 50KG
		// SALT >> 1KG
		// oil, water

		byte b = -126;
		int i = 34;
		System.out.println(b);
		System.out.println(i);

		short s = 3276;
		System.out.println(s);

		int i1 = 3434343;

		long l1 = 3434;

		// Floating Values
		float f1 = 3434.3434f;
		double d1 = 345435345.434343;

		System.out.println(f1);
		System.out.println(d1);

		// character - single
		// anything you see on the keyboard is a character
		char c1 = '%';
		System.out.println(c1);

		// boolean can store only true or false
		// are you guys paying attention to my session?
		// isPresent

		boolean isPresent = true;
		System.out.println(isPresent);

		// boolean a1 = True; //error
		// boolean a2 = False; //error
		boolean a3 = true; // no
		boolean a4 = false; // no
		// boolean a5 = 1; //E
		// boolean a6 = 0; //E

		// HW: practise below two lines in C and C++
		// boolean a5 = 1; //E
		// boolean a6 = 0; //E

	}
}
