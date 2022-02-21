package com.revature.spring_java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;

import com.revature.spring_java.models.BaseballCoach;
import com.revature.spring_java.models.Coach;
import com.revature.spring_java.models.FootballCoach;
import com.revature.spring_java.services.MotivationService;

// Thiss class is used for the programmatic registration of beans within the spring container 
@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Value("${coach-email}")
	private String coachEmail;
	
	@Bean
	public MotivationService motivationService() {
		return new MotivationService();
	}
	
	@Bean("myCoach")
	@Scope("prototype") // converts from singleton
	public Coach someCoach() {
		return new BaseballCoach(motivationService()); // constructor injection (manual bean wiring)
	}
	
	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
	public FootballCoach footballCoach() {
		FootballCoach footballCoach = new FootballCoach();
		footballCoach.setMotivationService(motivationService()); // setter injection
		footballCoach.setTeamName("Spring sprouts");
		footballCoach.setEmail(coachEmail);
		return footballCoach;
	}
}
