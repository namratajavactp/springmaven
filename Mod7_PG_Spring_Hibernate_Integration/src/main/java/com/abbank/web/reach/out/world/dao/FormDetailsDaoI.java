package com.abbank.web.reach.out.world.dao;

import java.util.ArrayList;

import com.abbank.web.reach.out.world.beans.CustInfo;

	public interface FormDetailsDaoI {
		
		public void saveFormDetails(CustInfo custInfo);
	
		public ArrayList<CustInfo> fetchFormDetails(Integer custId);
	
	}
