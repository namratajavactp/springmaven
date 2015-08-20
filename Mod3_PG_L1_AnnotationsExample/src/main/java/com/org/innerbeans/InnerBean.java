package com.org.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.wiringbeans.AccountDetails;
import com.org.wiringbeans.AccountType;

	public class InnerBean {
	
		public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "./innerbean.xml");
	        AccountDetails sp = (AccountDetails) context
					.getBean("AccountDetails");
	        sp.setName("James Peter");
			AccountType type = sp.getAccType();
			type.setName("Savings");
			sp.setAccType(type);
			System.out.println("Account Details: " + sp.getName());
			System.out.println("Account Type: " + sp.getAccType().getName());
	    }
		
	}

	
	
	