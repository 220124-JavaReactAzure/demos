package com.revature.spring_xml.models;

import com.revature.spring_xml.services.MotivationService;

public class BaseballCoach implements Coach {
	
	private final MotivationService motivationService;
	
	public BaseballCoach(MotivationService motivationService) {
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
