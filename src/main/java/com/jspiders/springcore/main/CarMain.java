package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.CarBean;

public class CarMain {
	public static void main(String args[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("CarConfig.xml");
	CarBean car= (CarBean) context.getBean("carDemo");
	System.out.println(car);
	((ClassPathXmlApplicationContext) context).close();
	}
	

}
