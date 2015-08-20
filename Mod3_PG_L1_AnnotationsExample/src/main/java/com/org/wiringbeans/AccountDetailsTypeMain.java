package com.org.wiringbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class AccountDetailsTypeMain {
	
		public static void main(String[] args) {
			try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						"spring-config.xml");
				AccountDetails sp = (AccountDetails) context
						.getBean("AccountDetails");
				sp.setName("James Peter");
				AccountType type = sp.getAccType();
				type.setName("Savings");
				sp.setAccType(type);
				System.out.println("Account Details: " + sp.getName());
				System.out.println("Account Type: " + sp.getAccType().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	
	