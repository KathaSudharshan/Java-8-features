package com.java.equalsandhashcode;

public class Address {
	private int houseNo;
	private String streetName;
	private String state;
	private int pincode;
	private String country;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(int houseNo, String streetName, String state, int pincode, String country) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}
	
	public String getAddress(){
		return this.houseNo + ", "+ this.streetName +", "+ this.state +", "+ this.pincode +", "+ this.country;
	}

}
