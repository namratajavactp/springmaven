package com.abbank.web.reach.out.world.beans;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name = "cust_info")
	public class CustInfo implements Serializable {
	
		/**
			 * 
			 */
		private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy = IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
		private Integer custId;
	
		@Column(name = "name")
		private String custName;
	
		@Column(name = "last_name")
		private String lastName;
	
		@Column(name = "email")
		private String custEmail;
	
		@Column(name = "occupation")
		private String custOccupation;
	
		@Column(name = "income")
		private Integer custIncome;
	
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinColumn(name = "address_id")
		private Set<Address> address;
	
		//create getters and setters
		
		public Integer getCustId() {
			return custId;
		}
	
		public void setCustId(Integer custId) {
			this.custId = custId;
		}
	
		public String getLastName() {
			return lastName;
		}
	
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
		public String getCustName() {
			return custName;
		}
	
		public void setCustName(String custName) {
			this.custName = custName;
		}
	
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
	
		public Integer getCustIncome() {
			return custIncome;
		}
	
		public void setCustIncome(Integer custIncome) {
			this.custIncome = custIncome;
		}
	
		public Set<Address> getAddress() {
			return address;
		}
	
		public void setAddress(Set<Address> address) {
			this.address = address;
		}
	
	}
