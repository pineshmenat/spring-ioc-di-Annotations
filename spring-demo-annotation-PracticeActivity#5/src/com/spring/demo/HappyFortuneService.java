package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It's Not Whether You Get Knocked Down, Its Whether You Get Up.";
	}

}
