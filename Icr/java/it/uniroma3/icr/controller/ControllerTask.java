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

import it.uniroma3.icr.model.Simbolo;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.model.Utente;
import it.uniroma3.icr.service.impl.FacadeSimbolo;
import it.uniroma3.icr.service.impl.FacadeTask;

@Controller
public class ControllerTask {
	
	@Autowired
	private FacadeTask facadeTask;
	
	@Autowired
	private FacadeSimbolo facadeSimbolo;
	
	@RequestMapping(value="/inserisciTask")
	private String newTask(@ModelAttribute Task task, Model model) {
		
		return"amministrazione/inserisciTask";
	}
	
	@RequestMapping(value="/inserisciInformazioniTask", method = RequestMethod.POST)
	public String inserisciInformazioni(@ModelAttribute String simbolo, @ModelAttribute Task task, Model model) {
		model.addAttribute("simboli", facadeSimbolo.retriveAllSimboli());

		
			
		
		
		
		return "amministrazione/inserisciInformazioniTask";
	}
	
	@RequestMapping(value="/aggiungiTask", method = RequestMethod.POST)
	public String confermaTask(@ModelAttribute Task task, Model model, @Validated Task t, BindingResult bindingResult) {
		model.addAttribute("simboli", facadeSimbolo.retriveAllSimboli());

		facadeTask.addTask(task);
		model.addAttribute("task", task);
		return "amministrazione/inserisciInformazioniTask";
	}
	
	@RequestMapping(value="/confermaTask", method = RequestMethod.POST)
	public String aggiungiTask(@ModelAttribute Task task, Model model, @Validated Task t,BindingResult bindingResult) {
		Task p = facadeTask.retriveTask(task.getTitolo());
		if(bindingResult.hasErrors()) {
			return "amministrazione/inserisciTask";
		}
		if(p!=null) {
			model.addAttribute("nomeErrore", "Nome esistente");
			return "amministrazione/inserisciTask";
		}
			model.addAttribute("task", task);
		return "amministrazione/inserisciTask";
	}
	
	@RequestMapping(value="/nuovoLavoro", method = RequestMethod.GET)
	public String lavoro(@ModelAttribute Task task, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List<Task> tasks = new ArrayList<>();

		if(!(auth instanceof AnonymousAuthenticationToken)) {
			tasks = facadeTask.retriveAllTask();
			model.addAttribute("task", getMathRandomList(tasks));
		}
		
		
		return "utenti/nuovoLavoro";
		
		
	}
	public Task getMathRandomList(List<Task> list) {
        int index = (int) (Math.random() * list.size());
        return  list.get(index);
    }
	
	
}
