package com.abbank.web.reach.out.world.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.abbank.web.reach.out.world.beans.EnrollRequest;

//Line 1
@Controller
//Line 2
@RequestMapping("/enrollRequest.html")
public class SubmitEnrollRequest {
	// Line 3
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(ModelMap model) {

		// Line 4
		EnrollRequest request = new EnrollRequest();

		// Line 5
		model.addAttribute("enrollRequest", request);

		// Line 6
		return "submitEnrollRequest";
	}
	//// Line 7
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submitEnrollRequest(
			@ModelAttribute("enrollRequest") EnrollRequest enrollRequest,
			BindingResult result, SessionStatus status) {
		// Line 8
		System.out.println("enrollRequest  ::: " + enrollRequest.getFirstname()
				+ "\t\t" + enrollRequest.getLastname() + "\t\t"
				+ enrollRequest.getIncome());
		// Line 9
		ModelAndView modelAndView = new ModelAndView("success");
		// Line 10
		if (enrollRequest.getIncome() < 100000) {
			modelAndView = new ModelAndView("error");
		}
		// Line 12
		return modelAndView;
	}
}


