package it.uniroma3.icr.controller;

import java.util.ArrayList;
import java.util.List;

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

import it.uniroma3.icr.model.Symbol;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.model.Student;
import it.uniroma3.icr.service.impl.SymbolFacade;
import it.uniroma3.icr.service.impl.TaskFacade;

@Controller
public class TaskController {
	
	@Autowired
	private TaskFacade facadeTask;
	
	@Autowired
	private SymbolFacade facadeSimbolo;
	
	@RequestMapping(value="/insertTask")
	private String newTask(@ModelAttribute Task task, Model model) {
		model.addAttribute("symbols", facadeSimbolo.retriveAllSymbols());
		return"administration/insertTask";
	}
	
//	@RequestMapping(value="/insertTaskInformation", method = RequestMethod.POST)
//	public String inserisciInformazioni(@ModelAttribute String symbol, @ModelAttribute Task task, Model model) {
//		model.addAttribute("symbols", facadeSimbolo.retriveAllSymbols());
//		
//		
//		Symbol s = facadeSimbolo.retriveSymbol(symbol);
//		
//		List<Symbol> l = new ArrayList<>();
//		l.add(s);
//		task.setSymbols(l);
//		model.addAttribute("symbols", s);
//		
//		
//			
//		
//		
//		
//		return "administration/insertTaskInformation";
//	}
	
	@RequestMapping(value="/addSymbol", method = RequestMethod.POST)
	public String addSymbol(@ModelAttribute Symbol symbol, @ModelAttribute Task task, Model model, @Validated Symbol s1, BindingResult bindingResult) {
		
		model.addAttribute("symbols", facadeSimbolo.retriveAllSymbols());
		List<Symbol> list = new ArrayList<>();

		List<Symbol> l = facadeSimbolo.retriveAllSymbols();
		for(Symbol s : l) {
			s = facadeSimbolo.retriveSymbol(symbol.getTranscription());
			list.add(s);
			

		}
		//List<Symbol> list = new ArrayList<>();
		task.setSymbols(list);
		
		
		
		
		return "administration/insertTaskInformation";
		
		
	}
	
	
	@RequestMapping(value="/addTask", method = RequestMethod.POST)
	public String confirmTask(@ModelAttribute Task task, Model model, @Validated Task t, BindingResult bindingResult) {
		 
		model.addAttribute("symbols", facadeSimbolo.retriveAllSymbols());
		
		facadeTask.addTask(task);
		model.addAttribute("task", task);
		return "administration/insertTaskInformation";
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
	@RequestMapping(value="/newTask", method = RequestMethod.GET)
	public String task(@ModelAttribute Task task, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List<Task> tasks = new ArrayList<>();

		if(!(auth instanceof AnonymousAuthenticationToken)) {
			tasks = facadeTask.retriveAllTask();
			model.addAttribute("task", getMathRandomList(tasks));
		}
		
		
		return "users/newTask";
		
		
	}
	public Task getMathRandomList(List<Task> list) {
        int index = (int) (Math.random() * list.size());
        return  list.get(index);
    }
	
	
}
