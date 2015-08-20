package com.abbank.web.reach.out.world.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abbank.web.reach.out.world.beans.EnrollRequest;
import com.abbank.web.reach.out.world.service.SaveDataService;

	//Line 1
	@Controller
	// Line 2
	@RequestMapping("/GetEnrollDetails.html")
	public class FetchEnrolledRequest {
	
		@Autowired
		SaveDataService saveDataService;
	
		@RequestMapping(method = RequestMethod.GET)
		public ModelAndView fetchEnrollRequest(@RequestParam Integer custId) {
	
			EnrollRequest enrollRequest = saveDataService.fetchFormDetails(custId);
	
			System.out.println("Fetched Successfully");
			ModelAndView modelAndView = new ModelAndView("adminPage");
			modelAndView.addObject("enrollRequest", enrollRequest);
			return modelAndView;
		}
	}
