package com.revature.spring_java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
@ComponentScan("com.revature")
public class AppConfig {

}
