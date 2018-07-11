package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune from REST!!";
	}
}
