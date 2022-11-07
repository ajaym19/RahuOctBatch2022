package com.w2a.encapsulation;

public class App {

	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.getEmpName());
		e1.setEmpName("Ajay");;
		System.out.println(e1.getEmpName());
		System.out.println(e1.getDept());
		e1.setGender('X');
		System.out.println(e1.getGender());
	}
}
