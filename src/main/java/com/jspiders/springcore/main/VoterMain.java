package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.VoterBean;
import com.jspiders.springcore.bean.VotingCardBean;

public class VoterMain {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("VoterVotingConfig.xml");
	 VoterBean voter1=context.getBean( "voter1" ,VoterBean.class);
	 VotingCardBean voting=context.getBean( "card1" ,VotingCardBean.class);
	 System.out.println(voter1);
	 System.out.println(voting);
voter1.setVotingCardBean(voting);
voting.setVoter(voter1);


	 ((ClassPathXmlApplicationContext)context).close();
	 
	 
}
}
