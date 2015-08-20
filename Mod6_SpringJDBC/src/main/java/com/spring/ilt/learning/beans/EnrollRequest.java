package com.spring.ilt.learning.beans;


public class EnrollRequest {

	private int id;
	private String firstname;
	private String lastname;
	private Integer income;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}


