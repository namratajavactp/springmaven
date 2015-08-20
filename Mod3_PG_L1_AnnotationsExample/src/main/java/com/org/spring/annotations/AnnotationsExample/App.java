package com.org.spring.annotations.AnnotationsExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		Account acc = (Account) context.getBean("account");
		System.out.println(acc);
    }
}


