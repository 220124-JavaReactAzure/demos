package com.revature.spring_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.spring_xml.models.Coach;
import com.revature.spring_xml.models.FootballCoach;

public class SpringDriver {
	public static void main(String[] args) {
		System.out.println("Creating a bean container....");
		
		// defalut is beans.xml
		try(ClassPathXmlApplicationContext beanContainer = new ClassPathXmlApplicationContext("beans.xml")){
			

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
