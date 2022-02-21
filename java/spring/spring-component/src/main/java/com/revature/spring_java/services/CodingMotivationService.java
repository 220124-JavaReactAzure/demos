package com.revature.spring_java.services;

import org.springframework.stereotype.Service;

@Service
public class CodingMotivationService implements MotivationService {

	@Override
	public String provideMotivationalQuote() {
		// TODO Auto-generated method stub
		return "Suffer now through all the leetcode, code evals and hackerranks, so you can code like a boss for the rest of your life - some rando at Revature";
	}

}
