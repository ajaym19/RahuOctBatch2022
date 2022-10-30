package com.w2a.classesobjects;

public class ConstructorDemo {

	/*
	 * Constructor: used to initialize the variables
	 * 
	 * it is always the same name as class name
	 * 
	 * if there is no constructor defined, then default constructor will be called
	 */

	int empId;
	String name;
	String dept;

	public ConstructorDemo() {
		System.out.println("I am inside a Constructor");

	}

	public ConstructorDemo(int id, String n) {
		System.out.println("I am inside a parametrized Constructor");
		
		empId = id;
		name = n;
	}

	public ConstructorDemo(int empId, String name, String dept) {
		//empId?
		//i want to access global variable
		//use this
		empId = empId;
		this.name = name;
		this.dept = dept;
	}

}
