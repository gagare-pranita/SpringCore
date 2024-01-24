package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.Person1;

public class Person1Main {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("Person1.xml");
	Person1 person= (Person1) context.getBean("person");
	System.out.println(person);
	((ClassPathXmlApplicationContext) context).close();

}
}
