package it.uniroma3.icr.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.Student;
import it.uniroma3.icr.service.impl.StudentFacade;

@Controller
public class UserController {
	
	@Autowired
	private StudentFacade userFacade;
	
	//	@Autowired
//	@Qualifier("validatorUtente")
//	private Validator validator;
//	@InitBinder
//	private void initBinder(WebDataBinder binder) {
//		binder.setValidator(validator);
//	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String registrazione(@ModelAttribute Student utente) {
		return "registration";
	}
	
	
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public String confirmUser(@ModelAttribute Student user, Model model, @Validated Student u, BindingResult bindingResult) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String passwordEncode = passwordEncoder.encode(user.getPassword());
		user.setPassword(passwordEncode);
		userFacade.addUser(user);
		return "login";
	}
	
	@RequestMapping(value="/confirmUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute Student user, Model model, @Validated Student u,BindingResult bindingResult) {
		Student p = userFacade.retrieveUser(user.getUsername());
		if(bindingResult.hasErrors()) {
			return "registration";
		}
		if(p != null) {
			model.addAttribute("usernameErrore", "Username esistente");
			return "registration";
		}
			model.addAttribute("utente", user);
		return "registration";
	}
}
