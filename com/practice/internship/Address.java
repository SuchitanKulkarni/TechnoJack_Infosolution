package com.practice.internship;

public class Address {
	
	private int flatno;
	private String areaString;
	private String cityString;
	private String stateString;
	private String countyString;
	private int pincode;
	
	
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getAreaString() {
		return areaString;
	}
	public void setAreaString(String areaString) {
		this.areaString = areaString;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public String getStateString() {
		return stateString;
	}
	public void setStateString(String stateString) {
		this.stateString = stateString;
	}
	public String getCountyString() {
		return countyString;
	}
	public void setCountyString(String countyString) {
		this.countyString = countyString;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", areaString=" + areaString + ", cityString=" + cityString
				+ ", stateString=" + stateString + ", countyString=" + countyString + ", pincode=" + pincode + "]";
	}
	
	
	

}
