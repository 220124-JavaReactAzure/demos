package com.revature.spring_java.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CoachCoachMotivationService implements MotivationService {

	@Override
	public String provideMotivationalQuote() {
		
		return "One of these days charles will finally ride his bike again the lazy fool, be better than him";
	}

}
