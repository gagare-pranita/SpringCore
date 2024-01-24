package com.jspiders.springcore.bean;

public class VotingCardBean {
	int id;
long vNo;
VoterBean voter;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getvNo() {
	return vNo;
}
public void setvNo(long vNo) {
	this.vNo = vNo;
}
public VoterBean getVoter() {
	return voter;
}
public void setVoter(VoterBean voter) {
	this.voter = voter;
}
@Override
public String toString() {
	return "VotingCardBean [id=" + id + ", vNo=" + vNo + ", voter=" + voter + ", getId()=" + getId() + ", getvNo()="
			+ getvNo() + ", getVoter()=" + getVoter()+ "]";
}


}
