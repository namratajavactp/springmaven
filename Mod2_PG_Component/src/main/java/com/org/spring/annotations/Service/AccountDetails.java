package com.org.spring.annotations.Service;

public class AccountDetails implements AccountService{

	public boolean validateAccount(int accID) {
		System.out.println("Valid Account");
		return true;
	}

}



