package com.org.spring.annotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.org.spring.annotations.Service.AccountDetails;
import com.org.spring.annotations.Service.AccountService;

@Configuration
@ComponentScan(value = "com.org.spring.annotations.consumer")
public class DIConfiguration {

	@Bean
	public AccountService validateService(){
		return new AccountDetails();
	}
}



