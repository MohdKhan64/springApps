package com.springdemos.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		
		  //create the spring container
          ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/list/config.xml");
          
          //get the Employee bean from the container
          Hospital hosp =  (Hospital) context.getBean("hosp");
          
          //print the bean
          System.out.println(hosp);
          
          
	}
}
