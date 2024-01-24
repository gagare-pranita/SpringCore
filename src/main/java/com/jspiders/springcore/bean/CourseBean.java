package com.jspiders.springcore.bean;



public class CourseBean {
	
	int id;
	String cName;
	Long fee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Long getFee() {
		return fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "CourseBean [id=" + id + ", cName=" + cName + ", fee=" + fee + ", getId()=" + getId() + ", getcName()="
				+ getcName() + ", getFee()=" + getFee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

	

}
