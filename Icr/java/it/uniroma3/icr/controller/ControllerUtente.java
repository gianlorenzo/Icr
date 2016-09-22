package it.uniroma3.icr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.Utente;
import it.uniroma3.icr.service.impl.FacadeTask;
import it.uniroma3.icr.service.impl.FacadeUtente;

@Controller
public class ControllerUtente {
	
	@Autowired
	private FacadeUtente facadeUtente;
	
	//	@Autowired
//	@Qualifier("validatorUtente")
//	private Validator validator;
//	@InitBinder
//	private void initBinder(WebDataBinder binder) {
//		binder.setValidator(validator);
//	}
	
	@RequestMapping(value="/registrazione", method = RequestMethod.GET)
	public String registrazione(@ModelAttribute Utente utente) {
		return "registrazione";
	}
	
	
	@RequestMapping(value="/aggiungiUtente", method = RequestMethod.POST)
	public String confermaUtente(@ModelAttribute Utente utente, Model model, @Validated Utente u, BindingResult bindingResult) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String passwordEncode = passwordEncoder.encode(utente.getPassword());
		utente.setPassword(passwordEncode);
		facadeUtente.addUtente(utente);
		return "login";
	}
	
	@RequestMapping(value="/confermaUtente", method = RequestMethod.POST)
	public String aggiungiUtente(@ModelAttribute Utente utente, Model model, @Validated Utente u,BindingResult bindingResult) {
		Utente p = facadeUtente.retrieveUtente(utente.getUsername());
		if(bindingResult.hasErrors()) {
			return "registrazione";
		}
		if(p != null) {
			model.addAttribute("usernameErrore", "Username esistente");
			return "registrazione";
		}
			model.addAttribute("utente", utente);
		return "registrazione";
	}
}
