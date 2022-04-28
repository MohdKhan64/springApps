package com.springdemos.springcore.dibasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		
		  //create the spring container
          ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/dibasic/config.xml");
          
          //get the Employee bean from the container
          Employee emp =  (Employee) context.getBean("emp1");
          
          //print the bean
          System.out.println(emp);
          
          
	}
}
