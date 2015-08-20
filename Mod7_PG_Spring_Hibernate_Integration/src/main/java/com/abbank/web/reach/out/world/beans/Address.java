package com.abbank.web.reach.out.world.beans;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "ADDRESS")
	public class Address implements Serializable {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy = IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
		private Integer addressId;
	
		@Column(name = "city")
		private String city;
	
		@Column(name = "state")
		private String state;
	
		@Column(name = "country")
		private String country;
	
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "cust_id")
		private CustInfo custInfo;
	
		//create getters and setters
		
		public Integer getAddressId() {
			return addressId;
		}
	
		public void setAddressId(Integer addressId) {
			this.addressId = addressId;
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
	
		public CustInfo getCustInfo() {
			return custInfo;
		}
	
		public void setCustInfo(CustInfo custInfo) {
			this.custInfo = custInfo;
		}
	
	}
