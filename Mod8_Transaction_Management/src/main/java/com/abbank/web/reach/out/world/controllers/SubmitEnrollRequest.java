package com.abbank.web.reach.out.world.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.abbank.web.reach.out.world.beans.CustInfo;
import com.abbank.web.reach.out.world.services.SaveDataService;
import com.abbank.web.reach.out.world.services.SaveDataServiceI;

public class SubmitEnrollRequest extends SimpleFormController {

	//Line 1
	SaveDataServiceI dataService;

	
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		//EnrollRequest enrollRequest = (EnrollRequest) command;
		CustInfo custInfo = (CustInfo) command;
		System.out.println("enrollRequest  ::: " + custInfo.getCustEmail()
				+ "\t\t" + custInfo.getCustName() + "\t\t"
				+ custInfo.getCustOccupation());
		
		//Line 2
		//dataService.save(enrollRequest);
		
		dataService.saveFormDetails(custInfo);
		
		ModelAndView modelAndView = new ModelAndView("success");
//		if (enrollRequest.getIncome() < 100000) {
//			modelAndView = new ModelAndView("error");
//		}
		return modelAndView;
	}
	
	
	public SaveDataServiceI getDataService() {
		return dataService;
	}

	public void setDataService(SaveDataServiceI dataService) {
		this.dataService = dataService;
	}

/*
	//Line 3
	public SaveDataServiceI getDataService() {
		return dataService;
	}

	public void setDataService(SaveDataService dataService) {
		this.dataService = dataService;
	} */
}

