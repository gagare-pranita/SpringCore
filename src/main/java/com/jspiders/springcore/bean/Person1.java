package com.jspiders.springcore.bean;

public class Person1 {
	int id;
	String name;
	int age;
	Adhar1 adhar;
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
	public Adhar1 getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar1 adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + ", age=" + age + ", adhar=" + adhar + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAdhar()=" + getAdhar() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
