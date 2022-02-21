package com.revature.spring_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.spring_java.models.Coach;
import com.revature.spring_java.models.FootballCoach;

public class SpringDriver {
	public static void main(String[] args) {
		System.out.println("Creating a bean container....");
		
		// defalut is beans.xml
		try(AnnotationConfigApplicationContext beanContainer = new AnnotationConfigApplicationContext(AppConfig.class)){

			System.out.println("Bean container create");
			
			
			Coach headCoach = beanContainer.getBean("myCoach", Coach.class);
			
			System.out.println(headCoach.getDailyWorkout());
			System.out.println(headCoach.getMotivation());
			
			Coach assistantCoach = beanContainer.getBean("myCoach", Coach.class);
			System.out.println("Is same? " + (headCoach == assistantCoach));
			
			FootballCoach footballCoach = beanContainer.getBean("footballCoach", FootballCoach.class);
			System.out.println(footballCoach);
			System.out.println(footballCoach.getDailyWorkout());
			System.out.println(footballCoach.getMotivation());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
