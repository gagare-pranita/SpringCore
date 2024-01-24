package com.jspiders.springcore.bean;

public class AdharBean {
	int id;
	long adharNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	@Override
	public String toString() {
		return "AdharBean [id=" + id + ", adharNo=" + adharNo + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

