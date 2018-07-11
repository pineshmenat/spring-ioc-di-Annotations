package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	/*However, for the special case of when BOTH the first and second characters of the class name are upper case, then the name is NOT converted.
	For the case of RESTFortuneService
	RESTFortuneService --> RESTFortuneService
	No conversion since the first two characters are upper case.*/
	@Autowired
	@Qualifier("RESTFortuneService")
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
