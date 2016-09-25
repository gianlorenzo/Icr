package it.uniroma3.icr.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.Symbol;
import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.service.impl.SymbolFacade;
import it.uniroma3.icr.service.editor.SymbolEditor;
import it.uniroma3.icr.service.impl.JobFacade;

@Controller
public class JobController {
	
	private @Autowired SymbolEditor symbolEditor;
	
	@Autowired
	private JobFacade facadeJob;
	
	@Autowired
	private SymbolFacade facadeSimbolo;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Symbol.class, this.symbolEditor);
	}
	
	@RequestMapping(value="/insertJob")
	private String newJob(@ModelAttribute Job job, Model model) {
		model.addAttribute("symbols", facadeSimbolo.retriveAllSymbols());
		return"administration/insertJob";
	}
	
	@RequestMapping(value="/homeAdmin")
	public String toHomeAdmin() {
		return"administration/homeAdmin";
	}
	

	
	
	@RequestMapping(value="/addJob", method = RequestMethod.POST)
	public String confirmJob(@ModelAttribute Job job, Model model) {
		
		facadeJob.addJob(job);
		
		return "administration/jobRecap";
	}
	
	
	

	
	
	
	
}
