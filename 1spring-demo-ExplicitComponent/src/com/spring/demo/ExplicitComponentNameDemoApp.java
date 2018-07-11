package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExplicitComponentNameDemoApp {
	public static void main(String[] args) {
		
		//load context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//load bean
		Coach soccerCoach = context.getBean("thatSillyCoach", TennisCoach.class);
		
		//call method
		System.out.println(soccerCoach.getDailyWorkout());
		
		//Close context
		context.close();
	}

}
