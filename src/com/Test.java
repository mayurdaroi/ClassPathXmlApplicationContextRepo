package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test 
{
     public static void main(String[] args) 
     {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=(Employee)ac.getBean("e");
		e.callEmployee();//employee business method is going to get called from here
		
		//ApplicationContext ac1=new FileSystemXmlApplicationContext();
		
		Cashier c=(Cashier)ac.getBean("c");
		c.setName("Sachin");
		System.out.println(c.getName());
		
	 }
}
