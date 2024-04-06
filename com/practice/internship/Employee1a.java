package com.practice.internship;

public class Employee1a {
	
	private int eid;
	private String enameString;
	private Address address;
	private String designationString;
	
	@Override
	public String toString() {
		return "Employee1a [eid=" + eid + ", enameString=" + enameString + ", address=" + address
				+ ", designationString=" + designationString + "]";
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDesignationString() {
		return designationString;
	}
	public void setDesignationString(String designationString) {
		this.designationString = designationString;
	}
	

}
