package com.org.spring.annotations.AnnotationsExample;

public class Address {

	private String street;
	private String village;
	private String city;
	private String state;
	
	//create getters and setters

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
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

	@Override
	public String toString() {
		return "Address [street=" + street + ", village=" + village + ", city="
				+ city + ", state=" + state + "]";
	}
	
	
	

}