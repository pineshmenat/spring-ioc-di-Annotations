package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultComponentDemoApp {
	public static void main(String[] args) {
		
		//load context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//load bean with default component name
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		//call method
		System.out.println(soccerCoach.getDailyWorkout());
		
		//Close context
		context.close();
	}

}
