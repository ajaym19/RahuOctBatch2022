package com.w2a.classesobjects;

public class App {

	public static void main(String[] args) {
		// create an Object
		// class_name ref_var_name = new_Keyword constructor_call();
		
		

		Students s1 = new Students();
		s1.name = "Amrita";
		s1.studentId = 1;
		s1.schoolName = "Infosys";

		System.out.println(s1.name);
		System.out.println(s1.studentId);
		System.out.println(s1.schoolName);

		Students s2 = new Students();
		s2.name = "Shivam";
		s2.studentId = 2;
		
		System.out.println("1 "+s1.schoolName); //Infosys
		System.out.println("2 "+s2.schoolName); //null or w2a
		
		s2.schoolName = "Capgemini";

		System.out.println(s2.name);
		System.out.println(s2.studentId);
		System.out.println(s2.schoolName);
		System.out.println(s2.phoneNumber);
		
		System.out.println("3 "+s1.schoolName); //Infosys
		System.out.println("4 "+s2.schoolName); //Capgemini
		
		
		//Accessing static members
		System.out.println(Students.schoolName);

	}
}
