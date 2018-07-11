package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	/*
	 * As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary if the target bean only defines one constructor to begin with. 
	 * However, if several constructors are available, at least one must be annotated to teach the container which one to use.
	 * I personally prefer to use the @Autowired annotation because it makes the code more readable. 
	 * But as mentioned, the @Autowired is not required for this scenario.*/
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Go to Tennis Court Daily!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
