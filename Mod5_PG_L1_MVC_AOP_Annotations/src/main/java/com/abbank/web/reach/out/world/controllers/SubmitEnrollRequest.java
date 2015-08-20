package com.abbank.web.reach.out.world.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.abbank.web.reach.out.world.beans.EnrollRequest;
import com.abbank.web.reach.out.world.services.SaveDataService;

public class SubmitEnrollRequest extends SimpleFormController {

	//Line 1
	SaveDataService dataService;

	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		EnrollRequest enrollRequest = (EnrollRequest) command;
		System.out.println("enrollRequest  ::: " + enrollRequest.getFirstname()
				+ "\t\t" + enrollRequest.getLastname() + "\t\t"
				+ enrollRequest.getIncome());
		
		//Line 2
		dataService.save(enrollRequest);
		
		ModelAndView modelAndView = new ModelAndView("success");
		if (enrollRequest.getIncome() < 100000) {
			modelAndView = new ModelAndView("error");
		}
		return modelAndView;
	}

	//Line 3
	public SaveDataService getDataService() {
		return dataService;
	}

	public void setDataService(SaveDataService dataService) {
		this.dataService = dataService;
	}
}

