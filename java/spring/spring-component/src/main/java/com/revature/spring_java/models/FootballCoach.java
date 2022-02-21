package com.revature.spring_java.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.revature.spring_java.services.MotivationService;

@Component
public class FootballCoach implements Coach {
	
	@Value("${coach-email}")
	private String email;
	
	@Value("Spring sprouts")
	private String teamName;
	

	
	@Value("#{12*2}")
	private int teamSize;
	
	private MotivationService motivationService;
	
	

	public FootballCoach() {
		System.out.println("footbacl coach invoked");
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

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public MotivationService getMotivationService() {
		return motivationService;
	}

	@Autowired // required for setter injection
	public void setMotivationService(MotivationService coachCoachMotivationService) { // spring smort and knows the camelCase for our CoachCoach service
		this.motivationService = coachCoachMotivationService;
	}
	
	@PostConstruct
	public void customInit() {
		System.out.println("Custom football coach init invoked");
	}
	
	@PreDestroy
	public void customDestroy() {
		System.out.println("football custom destory");
	}

	@Override
	public String toString() {
		return "FootballCoach [email=" + email + ", teamName=" + teamName + ", motivationService=" + motivationService
				+ "]";
	}
	

}
