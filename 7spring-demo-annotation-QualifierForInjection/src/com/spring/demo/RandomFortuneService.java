package com.spring.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"It's Not Whether You Get Knocked Down, Its Whether You Get Up.",
			"People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do.",
			"Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough."
	};
	
	

	@Override
	public String getFortune() {
		Random myRandom = new Random();
		return data[myRandom.nextInt(data.length)];
	}
}
