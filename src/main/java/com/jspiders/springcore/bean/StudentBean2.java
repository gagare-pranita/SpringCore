package com.jspiders.springcore.bean;

public class StudentBean2 {
	int id;
	String name;
	String email;
	public StudentBean2(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentBean2 [id=" + id + ", name=" + name + ", email=" + email + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
