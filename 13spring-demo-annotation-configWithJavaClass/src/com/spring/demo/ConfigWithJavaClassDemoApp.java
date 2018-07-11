package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithJavaClassDemoApp {
	public static void main(String[] args) {
		
		//read spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on the bean
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		
		//close the context
		context.close();
	}
}
