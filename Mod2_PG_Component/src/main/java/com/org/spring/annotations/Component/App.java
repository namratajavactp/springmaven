package com.org.spring.annotations.Component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.spring.annotations.configuration.DIConfiguration;
import com.org.spring.annotations.consumer.MyApplication;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);

		app.validateAccount(123);
		// close the context
		context.close();
	}
}
