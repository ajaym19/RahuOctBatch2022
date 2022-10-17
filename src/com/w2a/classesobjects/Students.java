package com.w2a.classesobjects;

public class Students {

	int studentId;
	String name;
	long phoneNumber;
	int rollNo;
	char gender;
	int standard;
	char division;
	String address;
	static String schoolName = "W2A";
	static int schoolId = 1;

	
	public void attendLectures() {
		System.out.println("Attending Lectures");
	}

	public void selfStudy() {
		System.out.println("Doing self study");
		createProject();
		showSchoolInfo();
	}

	public void createProject() {
		System.out.println("Creating Project");
		System.out.println(schoolName);
		System.out.println(name);
	}
	
	public static void showSchoolInfo() {
		System.out.println("School is well placed and good for students");
		printSchoolName();
		
	}
	
	public static void printSchoolName() {
		System.out.println(schoolName);
	}
	
	

}
