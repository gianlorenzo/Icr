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
import it.uniroma3.icr.model.Student;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.service.impl.ImageFacade;
import it.uniroma3.icr.service.impl.JobFacade;
import it.uniroma3.icr.service.impl.StudentFacade;
import it.uniroma3.icr.service.impl.TaskFacade;

@Controller
public class TaskController {
	
	@Autowired
	public JobFacade facadeJob;
	
	@Autowired
	public ImageFacade imageFacade;

	@Autowired
	public TaskFacade taskFacade;
	
	@Autowired
	public StudentFacade studentFacade;
	
	
	@RequestMapping(value="/newTask", method = RequestMethod.GET)
	public String task(@ModelAttribute Task task, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		String s = auth.getName();
		
		Student student = studentFacade.retrieveUser(s);
		
		List<Job> jobs = new ArrayList<>();
		
		if(!(auth instanceof AnonymousAuthenticationToken)) {
			task.setStudent(student);
			taskFacade.addTask(task);
			
			model.addAttribute("task", task);
			model.addAttribute("images", imageFacade.retriveAllImages());
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
