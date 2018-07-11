package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("databaseFortuneService")
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
