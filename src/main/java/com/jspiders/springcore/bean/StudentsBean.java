package com.jspiders.springcore.bean;

import java.util.List;

public class StudentsBean {
	int id;
	String name;
	int age;
	List<CourseBean> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<CourseBean> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseBean> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "StudentsBean [id=" + id + ", name=" + name + ", age=" + age + ", courses=" + courses + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getCourses()=" + getCourses()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
