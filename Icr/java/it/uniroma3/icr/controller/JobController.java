package it.uniroma3.icr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
import org.springframework.web.bind.annotation.RequestParam;

import it.uniroma3.icr.model.Symbol;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.model.Student;
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
	
	
	

	
//	@RequestMapping(value="/confirmTask", method = RequestMethod.POST)
//	public String addTask(@ModelAttribute Task task, Model model, @Validated Task t,BindingResult bindingResult) {
//		Task p = facadeTask.retriveTask(task.getTitle());
//		if(bindingResult.hasErrors()) {
//			return "administration/insertTaskInformation";
//		}
//		if(p!=null) {
//			model.addAttribute("nomeErrore", "Nome esistente");
//			return "administration/insertTaskInformation";
//		}
//			model.addAttribute("task", task);
//		return "administration/insertTaskInformation";
//	}
//	
//	@RequestMapping(value="/newTask", method = RequestMethod.GET)
//	public String task(@ModelAttribute Task task, Model model) {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		List<Task> tasks = new ArrayList<>();
//
//		if(!(auth instanceof AnonymousAuthenticationToken)) {
//			tasks = facadeTask.retriveAllTask();
//			model.addAttribute("task", getMathRandomList(tasks));
//		}
//		
//		
//		return "users/newTask";
//		
//		
//	}
//	public Task getMathRandomList(List<Task> list) {
//        int index = (int) (Math.random() * list.size());
//        return  list.get(index);
//    }
	
	
	
	
}
