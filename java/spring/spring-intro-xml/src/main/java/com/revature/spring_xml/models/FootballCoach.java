package com.revature.spring_xml.models;

import com.revature.spring_xml.services.MotivationService;

public class FootballCoach implements Coach {
	
	private String email;
	private String teamName;
	private MotivationService motivationService;
	
	

	public FootballCoach() {
		System.out.println("football coach invoked");
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Todays' workout suicide runs";
	}

	public String getMotivation() {
		if(motivationService == null) {
			return "Sorry no motivation";
		}
		return "Coach tell's you" + motivationService.provideMotivationalQuote();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	// Setter-based Injection(for optional dependencies)
	public MotivationService getMotivationService() {
		return motivationService;
	}

	public void setMotivationService(MotivationService motivationService) {
		this.motivationService = motivationService;
	}
	
	public void customInit() {
		System.out.println("Custom football coach init invoked");
	}
	
	public void customDestroy() {
		System.out.println("football custom destory");
	}

	@Override
	public String toString() {
		return "FootballCoach [email=" + email + ", teamName=" + teamName + ", motivationService=" + motivationService
				+ "]";
	}
	

}
