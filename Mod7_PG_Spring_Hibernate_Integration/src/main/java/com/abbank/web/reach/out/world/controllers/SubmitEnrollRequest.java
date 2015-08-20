package com.abbank.web.reach.out.world.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.abbank.web.reach.out.world.beans.EnrollRequest;
import com.abbank.web.reach.out.world.service.SaveDataService;

	@Controller
	@RequestMapping("/enrollRequest.html")
	public class SubmitEnrollRequest {
	
		@Autowired
		SaveDataService saveDataService;
		@RequestMapping(method = RequestMethod.GET)
		public String initForm(ModelMap model) {
			EnrollRequest request = new EnrollRequest();
			model.addAttribute("enrollRequest", request);
			return "submitEnrollRequest";
		}
	
		@RequestMapping(method = RequestMethod.POST)
		public ModelAndView submitEnrollRequest(
				@ModelAttribute("enrollRequest") EnrollRequest enrollRequest,
				BindingResult result, SessionStatus status) {
			System.out.println("enrollRequest  ::: " + enrollRequest.getFirstname()
					+ "\t\t" + enrollRequest.getLastname() + "\t\t"
					+ enrollRequest.getIncome());
			saveDataService.saveFormDetails(enrollRequest);
	
			System.out.println("Saved Successfully");
			ModelAndView modelAndView = new ModelAndView("success");
			return modelAndView;
		}
		
	}
