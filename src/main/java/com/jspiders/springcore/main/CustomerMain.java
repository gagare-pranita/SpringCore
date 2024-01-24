package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.CustomerBean;
import com.jspiders.springcore.bean.ProductBean;

public class CustomerMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("CustomerProductConfig.xml");
	CustomerBean customer=(CustomerBean) context.getBean("customer1");
		System.out.println(customer);
		CustomerBean customer3=(CustomerBean) context.getBean("customer2");
		System.out.println(customer3);
		ProductBean product=(ProductBean)context.getBean("product1");
		System.out.println(product);
		((ClassPathXmlApplicationContext) context).close();
	}

}
