package com.w2a.abstraction;

public class ICICIBank implements IRBI{

	@Override
	public void depositMoney() {
		System.out.println("ICICI Bank Depositing Money");
		
	}

	@Override
	public void withDrawMoney() {
		System.out.println("ICICI Bank Withdrawing Money");
		
	}

	@Override
	public void giveInterest() {
		System.out.println("ICICI Bank Interest rate is 5%");
		
	}

}
