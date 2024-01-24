package com.jspiders.springcore.bean;

import java.util.List;

public class CustomerBean {
	int id;
	String name;
	String add;
	List<ProductBean> product;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public List<ProductBean> getProduct() {
		return product;
	}
	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "CustomerBean [id=" + id + ", name=" + name + ", add=" + add + ", product=" + product + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAdd()=" + getAdd() + ", getProduct()=" + getProduct()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
