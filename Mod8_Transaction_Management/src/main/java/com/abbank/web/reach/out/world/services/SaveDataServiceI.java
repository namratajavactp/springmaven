package com.abbank.web.reach.out.world.services;

import com.abbank.web.reach.out.world.beans.CustInfo;
import com.abbank.web.reach.out.world.beans.EnrollRequest;

public interface SaveDataServiceI {

	public void save(EnrollRequest enrollRequest);

	public void saveFormDetails(CustInfo custInfo);
}
