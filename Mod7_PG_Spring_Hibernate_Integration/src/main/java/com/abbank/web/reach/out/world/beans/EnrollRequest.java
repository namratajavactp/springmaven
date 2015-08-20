package com.abbank.web.reach.out.world.beans;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

	public class EnrollRequest {
	
		@NotEmpty
		private String firstname;
		private String lastname;
		private String custEmail;
		private String custOccupation;
		private String city;
		private String state;
		private String country;
	
		@Range(min = 1, max = 150)
		private Integer income;
	
		//create setters and getters
	
	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustOccupation() {
		return custOccupation;
	}

	public void setCustOccupation(String custOccupation) {
		this.custOccupation = custOccupation;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

}
