package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	/*@Qualifier is a nice feature, but it is tricky when used with Constructors.
	 * You have to place the @Qualifier annotation inside of the constructor arguments.
	 */
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
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
