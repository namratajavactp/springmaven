package com.abbank.web.reach.out.world.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.abbank.web.reach.out.world.beans.EnrollRequest;

public class SubmitEnrollRequest extends SimpleFormController {

	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		//Line 1
		EnrollRequest enrollRequest = (EnrollRequest) command;

		//Line 2
		System.out.println("enrollRequest  ::: " + enrollRequest.getFirstname()
				+ "\t\t" + enrollRequest.getLastname() + "\t\t"
				+ enrollRequest.getIncome());

		//Line 3
		ModelAndView modelAndView = new ModelAndView("success");

		//Line 4
		if (enrollRequest.getIncome() < 100000) {
			modelAndView = new ModelAndView("error");
		}

		//Line 5
		return modelAndView;

	}

}



/*
 * HttpSession session = request.getSession();
 * 
 * LoginBean loginBean=(LoginBean)command; session.setAttribute("login",
 * loginBean); int n= log.validate(loginBean);
 * session.setAttribute("loginOut","false" );
 * System.out.println("hhhhhhhhhhh********"+n); if(n!=0){ return new
 * ModelAndView("success"); }else { return new ModelAndView("fail"); }
 */

