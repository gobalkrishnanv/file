package com.test.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitial implements WebApplicationInitializer {

	public void onStartup(ServletContext c) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext ac=new AnnotationConfigWebApplicationContext();
		ac.register(WebConfig.class);
		ac.setServletContext(c);
		
		ServletRegistration.Dynamic s=c.addServlet("dispatcher", new DispatcherServlet(ac));
		s.setLoadOnStartup(1);
		s.addMapping("/");
	}

}
