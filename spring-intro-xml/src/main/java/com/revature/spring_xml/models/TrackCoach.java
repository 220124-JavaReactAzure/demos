package com.revature.spring_xml.models;

import com.revature.spring_xml.services.MotivationService;

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
		return "Track coach says" + motivationService.provideMotivationalQuote();
	}

}
