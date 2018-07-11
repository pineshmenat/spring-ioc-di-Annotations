package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
		Coach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		boolean result = (tennisCoach == alphaCoach);
		
		//call a method on the bean
		System.out.println("Are both equal: " + result);
		System.out.println("Memory address of tennisCoach: " + tennisCoach);
		System.out.println("Memory address of alphaCoach: " + alphaCoach);
		
		//close the context
		context.close();
	}
}
