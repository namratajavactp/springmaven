package com.org.spring.annotations.AnnotationsExample;

public class AccountWithoutAnnotations {

	private Address address;
	private int accID;
	private String accType;
	private String accName;

	// create setters and getters.

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the accID
	 */
	public int getAccID() {
		return accID;
	}

	/**
	 * @param accID
	 *            the accID to set
	 */
	public void setAccID(int accID) {
		this.accID = accID;
	}

	/**
	 * @return the accType
	 */
	public String getAccType() {
		return accType;
	}

	/**
	 * @param accType
	 *            the accType to set
	 */
	public void setAccType(String accType) {
		this.accType = accType;
	}

	/**
	 * @return the accName
	 */
	public String getAccName() {
		return accName;
	}

	/**
	 * @param accName
	 *            the accName to set
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}

}
