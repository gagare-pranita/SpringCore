package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.PlayerBean;

public class PlayerMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("PlayerTeamConfig.xml");
		 PlayerBean player1=(PlayerBean)context.getBean("Player1");
		 System.out.println(player1);
		 PlayerBean player2=(PlayerBean)context.getBean("Player2");	 System.out.println(player2);
		 ((ClassPathXmlApplicationContext) context).close();
		 
		
	}
	
	

}
