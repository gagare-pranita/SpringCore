package com.jspiders.springcore.bean;

import java.util.List;

public class ProductBean {
	int id;
	String pName;
	double price;
	List<CustomerBean> customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<CustomerBean> getCustomer() {
		return customer;
	}
	public void setCustomer(List<CustomerBean> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", pName=" + pName + ", price=" + price + ", customer=" + customer
				+ ", getId()=" + getId() + ", getpName()=" + getpName() + ", getPrice()=" + getPrice()
				+ ", getCustomer()=" + getCustomer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
