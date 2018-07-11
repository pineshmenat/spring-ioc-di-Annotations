package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// FOR Spring 4.2: add support to resolve ${...} properties
    /*@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/
	
	//define bean for REST fortune service
	@Bean
	public FortuneService RESTFortuneService() {
		return new RESTFortuneService();
	}
	
	//define swimCoach bean and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(RESTFortuneService());
	}
}
