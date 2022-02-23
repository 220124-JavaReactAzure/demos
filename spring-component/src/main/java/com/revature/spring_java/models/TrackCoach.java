package com.revature.spring_java.models;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.revature.spring_java.services.MotivationService;

@Lazy
@Component
public class TrackCoach implements Coach {
	
	private final MotivationService motivationService;
	
	public TrackCoach(MotivationService motivationService) {
		this.motivationService = motivationService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Today's workout is to run a 30-min 5K";
	}

	public String getMotivation() {
		// TODO Auto-generated method stub
		return null;
	}

}
