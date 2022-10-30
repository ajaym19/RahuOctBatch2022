package com.w2a.abstraction;

public class App {

	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();
		hdfc.depositMoney();

		// can i create object of Interface?
		// IRBI i = new IRBI();

		// why below 2 provisions are allowed in JAVA, research on this

		ICICIBank icici = new ICICIBank();
		IRBI i = new ICICIBank(); // dynamic dispatch
		// try to call the method using both the ref_variable

		icici.depositMoney();
		hdfc.m1();
		hdfc.m2();
		hdfc.m3();
		
		//can I create object of abstract class

	}

}
