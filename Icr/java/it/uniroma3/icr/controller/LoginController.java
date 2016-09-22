package it.uniroma3.icr.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.User;

@Controller
public class LoginController {
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout() {
		return "login";
	}
	
	@RequestMapping(value="/admin**", method = RequestMethod.GET)
	public String loginAdmin() {
		return "administration/homeAdmin";
	}
	
	@RequestMapping(value="/user**", method = RequestMethod.GET)
	public String loginUser() {
		return "users/Task";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login (ModelMap model) {
		model.addAttribute("user", new User());
		return "login";

	}
	
	@RequestMapping(value="/role", method = RequestMethod.GET)
	public String loginRole() {
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        String role = auth.getAuthorities().toString();

	        String targetUrl = "";
	        if(role.contains("ROLE_USER")) {
	            targetUrl = "/users/job";
	        } else if(role.contains("ROLE_ADMIN")) {
	            targetUrl = "/administration/homeAdmin";
	        }
	        return targetUrl;
	    }
		
}
	
	

