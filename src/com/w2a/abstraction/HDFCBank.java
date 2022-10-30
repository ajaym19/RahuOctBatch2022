package com.w2a.abstraction;

public class HDFCBank extends AbstractClassDemo implements IRBI, ISEBI {

	public void changePIn() {
		System.out.println("ICICI Bank CHaning Pin");
	}

	@Override
	public void depositMoney() {
		System.out.println("HDFC Bak Depositing Money");

	}

	@Override
	public void withDrawMoney() {
		System.out.println("HDFC Bak Withdrawing Money");

	}

	@Override
	public void giveInterest() {
		System.out.println("HDFC Bak Interest Rate is 4%");

	}

	@Override
	public void intradayTrading() {
		// TODO Auto-generated method stub

	}

	@Override
	public void longTrading() {
		// TODO Auto-generated method stub

	}

	@Override
	public void equityTrading() {
		// TODO Auto-generated method stub

	}

	@Override
	public void debtTrading() {
		// TODO Auto-generated method stub

	}

	public void followIndianRules() {
		System.out.println("Hello");
	}

	@Override
	public void m3() {
	System.out.println("M3 Method");
		
	}
}
