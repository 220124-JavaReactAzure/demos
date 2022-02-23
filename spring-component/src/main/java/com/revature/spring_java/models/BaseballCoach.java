package com.revature.spring_java.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.revature.spring_java.services.CoachCoachMotivationService;
import com.revature.spring_java.services.MotivationService;

@Scope("prototype")
@Component("myCoach")
public class BaseballCoach implements Coach {
	
	private final MotivationService motivationService;
	
	@Autowired // for contrstutor injection, annotation isn't really quired
	public BaseballCoach(CoachCoachMotivationService motivationService) {
		System.out.println("BaseballCoach<init>");
		this.motivationService = motivationService;
	}

	public String getDailyWorkout() {
		return "Today's workout is to spend an hour on batting practice";
	}

	public String getMotivation() {
		return "baseball coach says " + motivationService.provideMotivationalQuote();
	}

}
