package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired	//Stay Consistent about Injection Types in your Project may it be Constructor, Setter method or Field level Injection
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Go to Tennis Court Daily!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
