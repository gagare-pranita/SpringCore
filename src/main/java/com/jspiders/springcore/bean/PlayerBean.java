package com.jspiders.springcore.bean;

public class PlayerBean {
	int id;
	String name;
	TeamBean  team;
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
	public TeamBean getTeam() {
		return team;
	}
	public void setTeam(TeamBean team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "PlayerBean [id=" + id + ", name=" + name + ", team=" + team + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getTeam()=" + getTeam() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
