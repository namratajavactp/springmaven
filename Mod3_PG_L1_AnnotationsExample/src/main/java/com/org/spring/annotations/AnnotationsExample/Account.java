package com.org.spring.annotations.AnnotationsExample;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {

	private Address address;
	private int accID;
	private String accType;
	private String accName;
	
	@Autowired
	public Account(Address address) {
		super();
		this.address = address;
	}

	//create getters and setters

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAccID() {
		return accID;
	}
//	@Qualifier("address1")
	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Override
	public String toString() {
		return "Account [address=" + address + ", accID=" + accID
				+ ", accType=" + accType + ", accName=" + accName + "]";
	}

}
