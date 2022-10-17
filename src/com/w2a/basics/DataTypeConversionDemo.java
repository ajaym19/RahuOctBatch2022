package com.w2a.basics;

public class DataTypeConversionDemo {

	//next session
	public static void main(String[] args) {
		//system:
		/*
		 * empId - Int
		 * 
		 * another system:
		 * empId - long
		 * 
		 * Bucket Theory:
		 * Bucket1 - 3L
		 * Bucket2 - 5L - 1L
		 * 
		 * Task: Transfer water from
		 * 1. B1 to B2 - easy, no problem
		 * 2. B2 to B1 - there might be loss of water
		 * 
		 * byte < short < int < long < float < double 
		 * 
		 * char to int, int to char
		 */
		
		
		int i = 45;
		long l1;
		l1 = i;
		System.out.println(i);
		System.out.println(l1);
		
		long l2 = 4545;
		int i2;
		i2 =  (int) l2;
		System.out.println(i2);
		System.out.println(l2);
		
		//int to float
		int i3 = 34;
		float f1 = i3;
		System.out.println(i3);
		System.out.println(f1);
		
		//flaot to int
		float f2 = 4.99f;
		int i4 = (int) f2;
		System.out.println(f2); //4.99
		System.out.println(i4); //
		
		//char to int, Ascii value will be assigned
		char c1 = 'a';
		int i5 = c1;
		System.out.println(c1); //A
		System.out.println(i5); //A
		
		int i6 = 61;
		char c2 = (char) i6;
		System.out.println(i6);
		System.out.println(c2);
		//---------------------------------------------
		
		//int to string
		//Wrapper classes
		
		//tostring, parseint
		//int to string
		int i7 = 121;
		String s1 = Integer.toString(i7);
		System.out.println(i7+10); //131
		System.out.println(s1+10); //12110
		
		//String to int
		String s2 = "3232";
		int i8 = Integer.parseInt(s2);
		System.out.println(s2+10);
		System.out.println(i8+10);
		
		
		//float to String
		float f4 = 23.43f;
		Float.toString(f4);
		Float.parseFloat(s2);
		
		
		
		
	}
}
