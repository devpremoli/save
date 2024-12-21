package com.example.simple_spring_project;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SimpleSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringProjectApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = context;

		MyApplication myApplication = (MyApplication) factory.getBean("myApp");
		myApplication.processMessage();
	}
}
