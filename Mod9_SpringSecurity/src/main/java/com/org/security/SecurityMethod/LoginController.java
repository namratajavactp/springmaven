package com.org.security.SecurityMethod;

import java.security.Principal;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
  
	@Controller
	public class LoginController {
	  
	    @RequestMapping(value="/main", method = RequestMethod.GET)
	    public String printWelcome(ModelMap model, Principal principal ) {
	  
	        String name = principal.getName();
	        model.addAttribute("username", name);
	        return "main_page";
	  
	    }
	    @RequestMapping(value="/login", method = RequestMethod.GET)
	    public String login(ModelMap model) {
	  
	        return "login_page";
	  
	    }
	    @RequestMapping(value="/loginError", method = RequestMethod.GET)
	    public String loginerror(ModelMap model) {
	        model.addAttribute("error", "true");
	        return "login_page";
	  
	    }
	    @Secured({"ROLE_REGULAR_USER","ROLE_ADMIN"})
	    @RequestMapping(value="/common", method = RequestMethod.GET)
	    public String common(ModelMap model) {
	  
	        return "common_page";
	  
	    }
	    @Secured("ROLE_ADMIN")
	    @RequestMapping(value="/admin", method = RequestMethod.GET)
	    public String admin(ModelMap model) {
	  
	        return "admin_page";
	  
	    }
	    @RequestMapping(value="/logout", method = RequestMethod.GET)
	    public String logout(ModelMap model) {
	  
	        return login(model);
	  
	    }
     
}