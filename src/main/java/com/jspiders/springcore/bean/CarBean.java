package com.jspiders.springcore.bean;
public class CarBean {
	int id;
	String name;
	String brand;
	long price;
	
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


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "CarBean [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getBrand()=" + getBrand() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
