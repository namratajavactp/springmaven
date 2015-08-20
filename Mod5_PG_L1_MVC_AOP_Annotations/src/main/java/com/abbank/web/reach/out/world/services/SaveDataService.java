package com.abbank.web.reach.out.world.services;

import com.abbank.web.reach.out.world.beans.EnrollRequest;

public class SaveDataService {
	
	public void save( EnrollRequest enrollRequest) {

		System.out.println("In service layer enrollRequest  ::: " + enrollRequest.getFirstname()
				+ "\t\t" + enrollRequest.getLastname() + "\t\t"
				+ enrollRequest.getIncome());

	}
}

