package com.w2a.stringsdemo;

public class StringsDemo {

	/*
	 * String
	 * it is a non primitive data type
	 * it is a class
	 * 
	 * String class is a final class in JAVA
	 * 
	 * Rule
	 * String Objects are immutable
	 * 
	 * String Object can be created in 2 ways
	 * 1. Using String Literal
	 * 		objects are created inside SCP Memory
	 * 		if an object with the same value is already present, it will not create a new Object
	 * 		the variable will point to the existing object
	 * 		if no object with same value is present, then new object will be created
	 * 
	 * 2. Using new keyword
	 * 		objects are created inside Heap Memory
	 * 		everytime a new object will be created
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//Using String Literal
		String name = "Ajay";
		System.out.println(name); //AJay
		name = name.concat("Trainer");
		System.out.println(name); //Ajay Trainer
		
		//What are the features of final in JAVA
		
		String s1 = "Hello";
		String s2 = "Hello"; //new object will not be created
		
		//Using new Keyword
		String s3 = new String("Apple");
		s3.concat("Mango");
		System.out.println(s3);//
		
		String s5 = new String("ABC");
		String s6 = new String("ABC");
		
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(s5);
		System.out.println(s5.trim());
		
		//String comparison
		// ==  it checks if both the ref_var are pointing to the same object
		// .equals
		
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s5 == s6); //false
		System.out.println(s5.equals(s6));//true
		
		
		//Mutable representatin of String class
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb);
		sb.append("Programming");
		System.out.println(sb); //
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		//reverse a string without using inbuilt method
		
		
	}
}
