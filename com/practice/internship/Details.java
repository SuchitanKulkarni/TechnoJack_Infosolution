package com.practice.internship;

public class Details {
	
	private int eid;
	private String enameString;
	private String designation;
	private String city;
	
	@Override
	public String toString() {
		return "Details [eid=" + eid + ", enameString=" + enameString + ", designation=" + designation + ", city="
				+ city + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnameString() {
		return enameString;
	}
	public void setEnameString(String enameString) {
		this.enameString = enameString;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
