package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Go and watch Soccer in Russia!!";
	}

}
