package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.StudentBean2;

public class StudentMain2 {
	public static void main(String[] args) {
		ApplicationContext  context=new  ClassPathXmlApplicationContext("StudentConfig.xml");
		 StudentBean2  Student2=context.getBean(StudentBean2.class);
		 System.out.println(Student2);
		((ClassPathXmlApplicationContext) context).close();
	
	}

}
