package com.revature.springAOP.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan("com.revature")
public class AppConfig implements WebMvcConfigurer, WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext beanContainer = new AnnotationConfigWebApplicationContext();
		beanContainer.register(AppConfig.class);
		
		servletContext.addListener(new ContextLoaderListener(beanContainer));
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatherServlet", new DispatcherServlet(beanContainer));
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
	}

}
