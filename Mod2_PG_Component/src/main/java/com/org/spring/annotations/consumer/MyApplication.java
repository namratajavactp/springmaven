package com.org.spring.annotations.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.spring.annotations.Service.AccountService;

@Component
public class MyApplication {

	private AccountService accService;

	@Autowired
	public void setAccService(AccountService accService) {
		this.accService = accService;
	}
	
	public boolean validateAccount(int accID){
		System.out.println("In MyApplication class");
		return this.accService.validateAccount(accID);
	}

}



