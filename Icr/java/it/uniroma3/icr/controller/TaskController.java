package it.uniroma3.icr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.service.impl.JobFacade;

@Controller
public class TaskController {
	
	@Autowired
	public JobFacade facadeJob;

	

	
	
	@RequestMapping(value="/newTask", method = RequestMethod.GET)
	public String task(@ModelAttribute Job job, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List<Job> jobs = new ArrayList<>();

		if(!(auth instanceof AnonymousAuthenticationToken)) {
			jobs = facadeJob.retriveAlljobs();
			model.addAttribute("job", getMathRandomList(jobs));
		}
		
		
		return "users/newTask";
		
		
	}
	public Job getMathRandomList(List<Job> list) {
        int index = (int) (Math.random() * list.size());
       return  list.get(index);
   }
	
	
	
}
