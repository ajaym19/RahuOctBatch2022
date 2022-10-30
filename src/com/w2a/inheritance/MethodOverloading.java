package com.w2a.inheritance;

public class MethodOverloading {

	/*
	 * Method overloading keeping the method signature different even if the method
	 * name is same
	 * 
	 * Can be achieved in 2 ways 1. By changing the no. of paramters 2. By changing
	 * the data type
	 * 
	 * Note: cannot be done by chaning the return type
	 */

	public void sum(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}

	public void sum(int a, int b, int c) {
		System.out.println("Adding 3 int numbers");
	}

	public void sum(float a, float b) {
		System.out.println("I am in float");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum(10, 20);
		obj.sum(1, 2, 4);
		obj.sum(3.4f, 4.5f);
	}
	
	//can i achieve this by changing the return type

}
