package com.abbank.web.reach.out.world.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.abbank.web.reach.out.world.beans.CustInfo;
import com.abbank.web.reach.out.world.beans.EnrollRequest;
import com.abbank.web.reach.out.world.dao.FormDetailsDaoI;
	
	@Transactional(readOnly=true)
	public class SaveDataService implements SaveDataServiceI{
		
		@Autowired
		FormDetailsDaoI formDetailsDaoI;
	
		public FormDetailsDaoI getFormDetailsDaoI() {
			return formDetailsDaoI;
		}
	
		public void setFormDetailsDaoI(FormDetailsDaoI formDetailsDaoI) {
			this.formDetailsDaoI = formDetailsDaoI;
		}
		
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public void saveFormDetails(CustInfo custInfo){
			formDetailsDaoI.saveFormDetails(custInfo);
		}
	
		public void save(EnrollRequest enrollRequest) {
	
			System.out.println("In service layer enrollRequest  ::: "
					+ enrollRequest.getFirstname() + "\t\t"
					+ enrollRequest.getLastname() + "\t\t"
					+ enrollRequest.getIncome());
	
		}
		
	}
