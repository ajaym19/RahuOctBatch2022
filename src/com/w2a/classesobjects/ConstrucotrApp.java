package com.w2a.classesobjects;

public class ConstrucotrApp {

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println(obj.empId);
		System.out.println(obj.name);
		
		
		ConstructorDemo obj1 = new ConstructorDemo(1, "Ajay");
		System.out.println(obj1.empId);
		System.out.println(obj1.name);
		
		
		ConstructorDemo obj2 = new ConstructorDemo(1, "Soniya", "IT");
		System.out.println(obj2.empId);
		System.out.println(obj2.name);
		System.out.println(obj2.dept);
		
	}
}
