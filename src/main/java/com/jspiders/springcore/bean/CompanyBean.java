package com.jspiders.springcore.bean;

import java.util.List;

public class CompanyBean {
	int id ;
	String name;
	List<EmployeeBean> employees;
	
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

	public List<EmployeeBean> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeBean> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "CompanyBean [id=" + id + ", name=" + name + ", employees=" + employees + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
