package com.abbank.web.reach.out.world.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abbank.web.reach.out.world.beans.Address;
import com.abbank.web.reach.out.world.beans.CustInfo;
import com.abbank.web.reach.out.world.beans.EnrollRequest;
import com.abbank.web.reach.out.world.dao.FormDetailsDaoI;
import com.abbank.web.reach.out.world.dao.FormDetailsDaoImpl;

	@Component
	public class SaveDataService {
	
		@Autowired
		FormDetailsDaoI formDetailsDaoI;
	
		public FormDetailsDaoI getFormDetailsDaoI() {
			return formDetailsDaoI;
		}
	
		public void setFormDetailsDaoI(FormDetailsDaoI formDetailsDaoI) {
			this.formDetailsDaoI = formDetailsDaoI;
		}
	
		public SaveDataService() {
			formDetailsDaoI = new FormDetailsDaoImpl();
		}
	
		public void saveFormDetails(EnrollRequest enrollRequest) {
			System.out.println("Enetered into Service");
			try {
				CustInfo custInfo = new CustInfo();
				custInfo.setCustEmail(enrollRequest.getCustEmail());
				custInfo.setCustIncome(enrollRequest.getIncome());
				custInfo.setCustName(enrollRequest.getFirstname());
				custInfo.setCustOccupation(enrollRequest.getCustOccupation());
				custInfo.setLastName(enrollRequest.getLastname());
				Address address = new Address();
				address.setCity(enrollRequest.getCity());
				address.setCountry(enrollRequest.getCountry());
				address.setState(enrollRequest.getState());
				address.setCustInfo(custInfo);
				Set<Address> addressSet = new HashSet<Address>();
				addressSet.add(address);
				custInfo.setAddress(addressSet);
				formDetailsDaoI.saveFormDetails(custInfo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		public EnrollRequest fetchFormDetails(Integer custId) {
			System.out.println("Enetered into Service in fetchFormDetails");
			EnrollRequest request = null;
			try {
				ArrayList<CustInfo> custInfoList = formDetailsDaoI
						.fetchFormDetails(custId);
				CustInfo custInfo = custInfoList.get(0);
				System.out.println("CustInfo Email :" + custInfo.getCustEmail());
				request = new EnrollRequest();
				request.setFirstname(custInfo.getCustName());
				request.setLastname(custInfo.getLastName());
				request.setCustEmail(custInfo.getCustEmail());
				request.setCustOccupation(custInfo.getCustOccupation());
				request.setIncome(custInfo.getCustIncome());
				Iterator<Address> itr = custInfo.getAddress().iterator();
				while (itr.hasNext()) {
					Address address = itr.next();
					request.setCountry(address.getCity());
					request.setCity(address.getCity());
					request.setState(address.getState());
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return request;
		}
	}
