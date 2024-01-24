package com.jspiders.springcore.bean;

public class VoterBean {
	int id;
	String name;
	String add;
	VotingCardBean votingcard;

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

	public VotingCardBean getVotingcard() {
		return votingcard;
	}

	public void setVotingcard(VotingCardBean votingcard) {
		this.votingcard = votingcard;
	}

	


	@Override
	public String toString() {
		return "VoterBean [id=" + id + ", name=" + name + ", add=" + add + ", votingcard=" + votingcard + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAdd()=" + getAdd() + ", getVotingcard()="
				+ getVotingcard()+ "]"; 
		
	}

	public void setVotingCardBean(VotingCardBean voting) {
		// TODO Auto-generated method stub
		
	}

	

}
