package com.spring.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")	
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000m on alternate day!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
