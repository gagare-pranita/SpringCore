package com.jspiders.springcore.bean;

public class PersonBean {
	int id;
	String name;
	AdharBean adhar;
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
	public AdharBean getAdhar() {
		return adhar;
	}
	public void setAdhar(AdharBean adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "PersonBean [id=" + id + ", name=" + name + ", adhar=" + adhar + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAdhar()=" + getAdhar() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
