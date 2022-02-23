package com.revature.spring_java.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.spring_java.services.MotivationService;

@Component
public class CodeCoach implements Coach {

	private MotivationService motivationService;
	
	@Autowired
	public void setMotivationService(MotivationService motivationService) {
		this.motivationService = motivationService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend at least 45min on medium level Hackerrank, LeetCode or codingame";
	}

	@Override
	public String getMotivation() {
		// TODO Auto-generated method stub
		return "The code coach who likes to coach coaches on coaching says: " + motivationService.provideMotivationalQuote();
	}

	
}
