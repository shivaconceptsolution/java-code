package com.kangaroo.interfaceexamle;

public class Bank implements BankOperation,Marketing {

	@Override
	public void credit() {
		System.out.println("Credit");
		
	}

	@Override
	public void debit() {
		System.out.println("Debit");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance");
		
	}

	@Override
	public void login() {
		System.out.println("Login");
		
	}

	@Override
	public void signUp() {
		System.out.println("signUp");
		
	}

	@Override
	public void generateLead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digitalMarketing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bankProducts() {
		// TODO Auto-generated method stub
		
	}
	

}
