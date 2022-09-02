package org.sample;

public class StuDetails {

	private String address;
	private String city;
	private String state;
	private int pincode;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public StuDetails(String address, String city, String state, int pincode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

}
