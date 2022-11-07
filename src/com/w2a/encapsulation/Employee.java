package com.w2a.encapsulation;

public class Employee {

	private int dbId; // r- no, w - no
	private int empId; // r - y, w-no
	private String empName; // r-y, w-yes
	private String dept; // r - yes, w-no
	private long mobileNo; // r-y, w-yes
	private static String companyName; // r - yes, , w -no
	private char gender;
	int a;
	protected int b;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		//M, F, O, U
		//code to check
		if (gender == 'Y' || gender == 'N' || gender == 'O') {
			this.gender = gender;
		}else {
			this.gender = 'U';
		}
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getEmpId() {
		return empId;
	}

	public String getDept() {
		return dept;
	}

	public static String getCompanyName() {
		return companyName;
	}

}
