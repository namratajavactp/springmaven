package com.abbank.web.reach.out.world.services;

import org.springframework.stereotype.Component;

import com.abbank.web.reach.out.world.beans.EnrollRequest;

@Component
public class SaveDataService implements ISaveDataService {
	
	public String save( EnrollRequest enrollRequest) {

		
		System.out.println("In service layer enrollRequest  ::: " + enrollRequest.getFirstname()
				+ "\t\t" + enrollRequest.getLastname() + "\t\t"
				+ enrollRequest.getIncome());
		
		return "xyz_success";
		
		//throw new Exception();

	}
}


