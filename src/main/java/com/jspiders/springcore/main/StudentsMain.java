package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.CourseBean;

import com.jspiders.springcore.bean.StudentsBean;

public class StudentsMain {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("StudentsCourseConfig.xml");
	StudentsBean student1=(StudentsBean)context.getBean("student1");
	StudentsBean student2=(StudentsBean)context.getBean("student2");
	System.out.println(student1);
	System.out.println(student2);
	((ClassPathXmlApplicationContext) context).close();
	
	

}

}