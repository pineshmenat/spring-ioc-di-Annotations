package com.spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/*For "prototype" scoped beans, Spring does not call the @PreDestroy method*/
@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Go to Tennis Court Daily!!";
	}
	
	/*The method can have any return type. However, "void' is most commonly used. 
	 * If you give a return type just note that you will not be able to capture the return value. As a result, "void" is commonly used.*/
	@PostConstruct
	public void initTennisCoachMethod() {
		System.out.println("TennisCoach: inside initTennisCoachMethod() method");
	}
	
	@PreDestroy
	public void destroyTennisCoachMethod() {
		System.out.println("TennisCoach: inside destroyTennisCoachMethod() method");
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
