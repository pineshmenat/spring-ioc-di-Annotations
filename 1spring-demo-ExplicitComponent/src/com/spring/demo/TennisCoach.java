package com.spring.demo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Go to Tennis Court Daily!!";
	}
}
