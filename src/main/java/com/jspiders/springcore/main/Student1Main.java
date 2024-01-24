package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.Student1Bean;

public class Student1Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Student1Config.xml");
	Student1Bean  student1=	context.getBean(Student1Bean.class);
	System.out.println(student1);
	((AnnotationConfigApplicationContext)context).close();
	}

}
