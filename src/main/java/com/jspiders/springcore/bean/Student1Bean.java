package com.jspiders.springcore.bean;

public class Student1Bean {
	private int id;
	private String name;
	private String add;
	public Student1Bean(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public Student1Bean() {
		super();
	}
	@Override
	public String toString() {
		return "Student1Bean [id=" + id + ", name=" + name + ", add=" + add + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
