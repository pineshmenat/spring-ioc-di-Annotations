package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierForInjectionDemoApp {
	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
